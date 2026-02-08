package br.edu.ifpb.padroes.atv1.streamflix.decorators.video;

import br.edu.ifpb.padroes.atv1.streamflix.VideoComponent;

public class WatermarkDecorator extends VideoDecorator {
    public WatermarkDecorator(VideoComponent video) { super(video); }

    @Override
    public void play() {
        System.out.println("[Extra] Adding digital watermark to: " + getTitle());
        super.play();
    }
}
