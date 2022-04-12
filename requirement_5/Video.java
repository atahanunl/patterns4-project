package requirement_5;

public class Video extends Data implements Compressible {
    private long duration;
    private double resolutionPercentage = 100;

    public Video(String name, String owner, double size, CompressionQuality compressionQuality, long duration, double resolutionPercentage) {
        super(name, owner, size, compressionQuality);
        this.duration = duration;
        this.resolutionPercentage = resolutionPercentage;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public double getResolutionPercentage() {
        return resolutionPercentage;
    }

    public void setResolutionPercentage(double resolutionPercentage) {
        this.resolutionPercentage = resolutionPercentage;
    }

    @Override
    public void compress(CompressionQuality compressionQuality) {
        if (this.getCompressionQuality() == null) {
            switch (compressionQuality) {
                case LOSSLESS -> {
                    System.out.println("Video is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    setCompressionQuality(CompressionQuality.LOSSLESS);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGHER -> {
                    System.out.println("Video is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.9);
                    setCompressionQuality(CompressionQuality.HIGHER);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGH -> {
                    System.out.println("Video is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.75);
                    setCompressionQuality(CompressionQuality.HIGH);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case NORMAL -> {
                    System.out.println("Video is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.5);
                    setCompressionQuality(CompressionQuality.NORMAL);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
            }
        } else {
            System.out.println("Video is already compressed !\n");
        }
    }

    @Override
    public void decompress() {
        if (this.getCompressionQuality() != null) {
            switch (this.getCompressionQuality()) {
                case LOSSLESS -> {
                    System.out.println("Video is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGHER -> {
                    System.out.println("Video is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.9);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGH -> {
                    System.out.println("Video is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.75);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case NORMAL -> {
                    System.out.println("Video is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.5);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
            }
        } else {
            System.out.println("Video is already decompressed !\n");
        }
    }
}
