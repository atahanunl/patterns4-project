package requirement_5;

public class Image extends Data implements Compressible {
    private double resolutionPercentage = 100;

    public Image(String name, String owner, double size, CompressionQuality compressionQuality, double resolutionPercentage) {
        super(name, owner, size, compressionQuality);
        this.resolutionPercentage = resolutionPercentage;
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
                    System.out.println("Image is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    setCompressionQuality(CompressionQuality.LOSSLESS);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGHER -> {
                    System.out.println("Image is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.9);
                    setCompressionQuality(CompressionQuality.HIGHER);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGH -> {
                    System.out.println("Image is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.85);
                    setCompressionQuality(CompressionQuality.HIGH);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case NORMAL -> {
                    System.out.println("Image is compressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() * 0.8);
                    setCompressionQuality(CompressionQuality.NORMAL);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
            }
        } else {
            System.out.println("Image is already compressed !\n");
        }
    }

    @Override
    public void decompress() {
        if (this.getCompressionQuality() != null) {
            switch (this.getCompressionQuality()) {
                case LOSSLESS -> {
                    System.out.println("Image is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGHER -> {
                    System.out.println("Image is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.9);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case HIGH -> {
                    System.out.println("Image is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.85);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
                case NORMAL -> {
                    System.out.println("Image is decompressed !");
                    System.out.println("Previous size : " + this.getSize());
                    this.setSize(getSize() / 0.8);
                    setCompressionQuality(null);
                    System.out.println("New size : " + this.getSize() + "\n");
                }
            }
        } else {
            System.out.println("Image is already decompressed !\n");
        }
    }
}
