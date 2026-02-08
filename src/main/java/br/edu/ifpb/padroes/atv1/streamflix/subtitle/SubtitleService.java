package br.edu.ifpb.padroes.atv1.streamflix.subtitle;

public class SubtitleService {

    public String getSubtitles(String videoId, String language) {
        System.out.println("Loading subtitles for " + videoId + " in " + language);
        return "Subtitles content";
    }
}
