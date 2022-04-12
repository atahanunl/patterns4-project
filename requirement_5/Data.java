package requirement_5;

public abstract class Data {
    private String name;
    private String owner;
    private double size;
    private CompressionQuality compressionQuality;

    public Data(String name, String owner, double size, CompressionQuality compressionQuality) {
        this.name = name;
        this.owner = owner;
        this.size = size;
        this.compressionQuality = compressionQuality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public CompressionQuality getCompressionQuality() {
        return compressionQuality;
    }

    public void setCompressionQuality(CompressionQuality compressionQuality) {
        this.compressionQuality = compressionQuality;
    }
}
