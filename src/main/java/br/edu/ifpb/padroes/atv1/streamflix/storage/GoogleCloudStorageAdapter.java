package br.edu.ifpb.padroes.atv1.streamflix.storage;

import br.edu.ifpb.padroes.atv1.streamflix.services.GoogleCloudStorage;

public class GoogleCloudStorageAdapter implements VideoStorage {

    private final GoogleCloudStorage gcsService;
    private final String projectId;

    public GoogleCloudStorageAdapter(String projectId) {
        this.gcsService = new GoogleCloudStorage();
        this.projectId = projectId;
    }

    @Override
    public byte[] download(String videoId) {
        return gcsService.retrieveFile(projectId, videoId);
    }

    @Override
    public void upload(String videoId, byte[] data) {
        gcsService.storeFile(projectId, videoId, data);
    }
}
