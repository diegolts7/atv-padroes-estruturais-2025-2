package br.edu.ifpb.padroes.atv1.streamflix.decorators.video;

import br.edu.ifpb.padroes.atv1.streamflix.VideoComponent;

public class AnalyticsDecorator extends VideoDecorator {
    public AnalyticsDecorator(VideoComponent video) { super(video); }

    @Override
    public void play() {
        super.play();
        System.out.println("[Extra] Recording playback statistics for: " + getTitle());
    }
}
