package requirement_3;

import java.util.Random;

public class ExcelExtractor extends DataExtractor {
    private String fileName;
    private String filePath;

    public ExcelExtractor() {

    }

    public ExcelExtractor(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    @Override
    protected boolean open() {
        if (new Random().nextInt(10) < 8) {
            System.out.println("Excel file opened successfully !");
            return true;
        } else {
            System.out.println("ERROR : Excel file cannot be found !");
            return false;
        }
    }

    @Override
    protected boolean retrieve() {
        if (new Random().nextInt(10) < 8) {
            System.out.println("Excel data retrieved successfully !");
            return true;
        } else {
            System.out.println("ERROR : Excel data cannot be retrieved !");
            return false;
        }
    }

    @Override
    protected boolean parse() {
        if (new Random().nextInt(10) < 8) {
            System.out.println("Excel data parsed successfully !");
            return true;
        } else {
            System.out.println("ERROR : Excel data cannot be parsed !");
            return false;
        }
    }

    @Override
    protected boolean load() {
        if (new Random().nextInt(10) < 8) {
            System.out.println("Excel data loaded successfully !");
            return true;
        } else {
            System.out.println("ERROR: Excel data cannot be loaded !");
            return false;
        }
    }

    @Override
    protected boolean close() {
        if (new Random().nextInt(10) < 8) {
            System.out.println("Excel file closed successfully !");
            return true;
        } else {
            System.out.println("ERROR : Excel file cannot be closed !");
            return false;
        }
    }

    @Override
    public String toString() {
        return fileName;
    }
}
