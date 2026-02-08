package br.edu.ifpb.padroes.atv1.streamflix;

import br.edu.ifpb.padroes.atv1.streamflix.auth.AuthenticationService;
import br.edu.ifpb.padroes.atv1.streamflix.converter.VideoConverter;
import br.edu.ifpb.padroes.atv1.streamflix.storage.VideoStorage;
import br.edu.ifpb.padroes.atv1.streamflix.facade.StreamingService;
import br.edu.ifpb.padroes.atv1.streamflix.subtitle.SubtitleService;

public class StreamflixFacade {

    private final AuthenticationService authService;
    private final VideoConverter converter;
    private final SubtitleService subtitleService;
    private final StreamingService streamingService;
    private final VideoStorage storage;

    public StreamflixFacade(VideoStorage storage) {
        this.authService = new AuthenticationService();
        this.converter = new VideoConverter();
        this.subtitleService = new SubtitleService();
        this.streamingService = new StreamingService();
        this.storage = storage;
    }

    public void watchVideo(String userId, String token, String videoId) {

        if (!authService.authenticate(userId, token)) {
            throw new RuntimeException("Authentication failed");
        }

        byte[] rawVideo = storage.download(videoId);
        byte[] convertedVideo = converter.convert(rawVideo, "MP4");

        subtitleService.getSubtitles(videoId, "pt-BR");

        Video video = new Video(videoId, "Movie Title", convertedVideo);
        video.play();

        streamingService.startStream(convertedVideo);
    }
}
