package br.edu.ifpb.padroes.atv1.streamflix.storage;

public interface VideoStorage {

    byte[] download(String videoId);

    void upload(String videoId, byte[] data);
}
