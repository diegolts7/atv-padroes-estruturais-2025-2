package br.edu.ifpb.padroes.atv1.streamflix.decorators.video;

import br.edu.ifpb.padroes.atv1.streamflix.VideoComponent;

public abstract class VideoDecorator implements VideoComponent {
    protected VideoComponent decoratedVideo;

    public VideoDecorator(VideoComponent video) {
        this.decoratedVideo = video;
    }

    public void play() {
        decoratedVideo.play();
    }

    public String getTitle() {
        return decoratedVideo.getTitle();
    }

    @Override
    public byte[] getData() {
        return decoratedVideo.getData();
    }

    @Override
    public String getId() {
        return decoratedVideo.getId();
    }
}
