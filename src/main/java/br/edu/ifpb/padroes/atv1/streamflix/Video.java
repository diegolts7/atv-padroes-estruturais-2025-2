package br.edu.ifpb.padroes.atv1.streamflix;

public class Video implements VideoComponent{

    private String id;
    private String title;
    private byte[] data;

    public Video(String id, String title, byte[] data) {
        this.id = id;
        this.title = title;
        this.data = data;
    }

    public void play() {
        System.out.println("Playing: " + title);
    }

    @Override
    public String getTitle() { return title; }

    public byte[] getData() {
        return data;
    }

    @Override
    public String getId() {
        return id;
    }
}
