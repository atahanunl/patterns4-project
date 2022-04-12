package requirement_3;

public abstract class DataExtractor {
    protected abstract boolean open();

    protected abstract boolean retrieve();

    protected abstract boolean parse();

    protected abstract boolean load();

    protected abstract boolean close();

    protected void extract() {
        if (!open()) {
            System.out.println(this + " could not be extracted !\n");
            return;
        } else if (!retrieve()) {
            System.out.println(this + " could not be extracted !\n");
            return;
        } else if (!parse()) {
            System.out.println(this + " could not be extracted !\n");
            return;
        } else if (!load()) {
            System.out.println(this + " could not be extracted !\n");
            return;
        } else if (close()) {
            System.out.println(this + " has been extracted successfully !\n");
        } else {
            System.out.println(this + " could not be extracted !\n");
        }
    }
}
