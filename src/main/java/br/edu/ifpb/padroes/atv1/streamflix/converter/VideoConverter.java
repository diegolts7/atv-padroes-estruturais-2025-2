package br.edu.ifpb.padroes.atv1.streamflix.converter;

public class VideoConverter {

    public byte[] convert(byte[] video, String format) {
        System.out.println("Converting video to: " + format);
        return video;
    }
}
