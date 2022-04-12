package requirement_3;

import java.util.Random;

public class Demo {
    private static DataExtractor dataExtractor;

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    dataExtractor = new WordExtractor("Word document " + i, "/home");
                    dataExtractor.extract();
                    break;
                case 1:
                    dataExtractor = new ExcelExtractor("Excel document " + i, "/home");
                    dataExtractor.extract();
                    break;
                case 2:
                    dataExtractor = new PDFExtractor("PDF document " + i, "/home");
                    dataExtractor.extract();
                    break;
            }
        }
    }
}
