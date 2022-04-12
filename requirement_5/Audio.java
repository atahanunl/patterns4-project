package requirement_5;

public class Audio extends Data implements Compressible {
    private long duration;

    public Audio(String name, String owner, double size, CompressionQuality compressionQuality, long duration) {
        super(name, owner, size, compressionQuality);
        this.duration = duration;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public void compress(CompressionQuality compressionQuality) {
        if (this.getCompressionQuality() == null) {
            switch (compressionQuality) {
                case LOSSLESS -> {
                    System.out.println("Audio is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    setCompressionQuality(CompressionQuality.LOSSLESS);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGHER -> {
                    System.out.println("Audio is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.7);
                    setCompressionQuality(CompressionQuality.HIGHER);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGH -> {
                    System.out.println("Audio is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.65);
                    setCompressionQuality(CompressionQuality.HIGH);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case NORMAL -> {
                    System.out.println("Audio is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.5);
                    setCompressionQuality(CompressionQuality.NORMAL);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
            }
        } else {
            System.out.println("Audio is already compressed !\n");
        }
    }

    @Override
    public void decompress() {
        if (this.getCompressionQuality() != null) {
            switch (this.getCompressionQuality()) {
                case LOSSLESS -> {
                    System.out.println("Audio is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGHER -> {
                    System.out.println("Audio is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.7);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGH -> {
                    System.out.println("Audio is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.65);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case NORMAL -> {
                    System.out.println("Audio is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.5);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
            }
        } else {
            System.out.println("Audio is already decompressed !\n");
        }
    }
}
