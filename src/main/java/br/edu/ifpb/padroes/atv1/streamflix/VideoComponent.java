package br.edu.ifpb.padroes.atv1.streamflix;

public interface VideoComponent {
    void play();
    String getId();
    String getTitle();
    byte[] getData();
}
