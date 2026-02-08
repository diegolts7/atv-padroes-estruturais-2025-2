package br.edu.ifpb.padroes.atv1.streamflix.decorators.video;

import br.edu.ifpb.padroes.atv1.streamflix.VideoComponent;

public class EncryptionDecorator extends VideoDecorator {
    public EncryptionDecorator(VideoComponent video) { super(video); }

    @Override
    public void play() {
        System.out.println("[Extra] Decrypting video stream for: " + getTitle());
        super.play();
    }
}
