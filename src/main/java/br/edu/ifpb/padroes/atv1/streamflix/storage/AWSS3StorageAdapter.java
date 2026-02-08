package br.edu.ifpb.padroes.atv1.streamflix.storage;

import br.edu.ifpb.padroes.atv1.streamflix.services.AWSS3Service;

public class AWSS3StorageAdapter implements VideoStorage {

    private final AWSS3Service s3Service;
    private final String bucketName;

    public AWSS3StorageAdapter(String bucketName) {
        this.s3Service = new AWSS3Service();
        this.bucketName = bucketName;
    }

    @Override
    public byte[] download(String videoId) {
        return s3Service.downloadFromS3(bucketName, videoId);
    }

    @Override
    public void upload(String videoId, byte[] data) {
        s3Service.uploadToS3(bucketName, videoId, data);
    }
}
