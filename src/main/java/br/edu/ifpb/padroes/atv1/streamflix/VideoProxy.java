package br.edu.ifpb.padroes.atv1.streamflix;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VideoProxy implements VideoComponent {
    private static Map<String, byte[]> videoCache = new HashMap<>();

    private Video realVideo;
    private String id;
    private String title;

    public VideoProxy(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public void play() {
        if (realVideo == null) {
            loadVideo();
        }

        realVideo.play();
    }

    private void loadVideo() {

        if (videoCache.containsKey(id)) {

            System.out.println("[PROXY LOG] Carregando vídeo '" + title + "' do CACHE local. (Economizando banda!)");
            byte[] cachedData = videoCache.get(id);
            this.realVideo = new Video(id, title, cachedData);
        } else {

            System.out.println("[PROXY LOG] Vídeo não encontrado no cache. Buscando no SERVIÇO EXTERNO (AWS/Google)...");

            byte[] downloadedData = downloadFromExternalService();
            videoCache.put(id, downloadedData);
            this.realVideo = new Video(id, title, downloadedData);
        }
    }

    private byte[] downloadFromExternalService() {
        return new byte[]{1, 0, 1, 1, 0};
    }

    @Override public String getId() { return id; }
    @Override public String getTitle() { return title; }
    @Override public byte[] getData() {
        if (Objects.isNull(realVideo)) loadVideo();

        return realVideo.getData();
    }
}
