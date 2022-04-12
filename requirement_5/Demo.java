package requirement_5;

public class Demo {
    public static void main(String[] args) {
        Video video = new Video("Video 1", "admin", 1024, null, 6000, 100);
        video.decompress();
        video.compress(CompressionQuality.HIGHER);

        System.out.println("*************************\n");

        Image image = new Image("Image 1", "admin", 768, null, 100);
        image.compress(CompressionQuality.HIGH);
        image.compress(CompressionQuality.NORMAL);
        image.decompress();

        System.out.println("*************************\n");

        Audio audio = new Audio("Audio 1", "admin", 96, null, 180);
        audio.compress(CompressionQuality.NORMAL);
        audio.decompress();
        audio.decompress();
    }
}
