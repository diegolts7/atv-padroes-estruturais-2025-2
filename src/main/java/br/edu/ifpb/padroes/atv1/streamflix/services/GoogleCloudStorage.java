package br.edu.ifpb.padroes.atv1.streamflix.services;

public class GoogleCloudStorage {

    public byte[] retrieveFile(String projectId, String fileName) {
        System.out.println("Retrieving from GCS: " + projectId + "/" + fileName);
        return new byte[1024];
    }

    public void storeFile(String projectId, String fileName, byte[] content) {
        System.out.println("Storing to GCS: " + projectId + "/" + fileName);
    }
}
