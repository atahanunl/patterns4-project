package requirement_4;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PieChart {
    private int width;
    private int height;
    private List<String> colors;
    private String title;
    private int precision;
    private boolean showPercentage;

    public PieChart(int width, int height, List<String> colors, String title, int precision, boolean showPercentage) {
        this.width = width;
        this.height = height;
        this.colors = colors;
        this.title = title;
        this.precision = precision;
        this.showPercentage = showPercentage;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*************************\n");
        stringBuilder.append("This is a pie chart\n");
        stringBuilder.append("Width : " + width + "\n");
        stringBuilder.append("Height : " + height + "\n");
        AtomicInteger colorCounter = new AtomicInteger(1);
        colors.forEach(color -> stringBuilder.append("Color " + colorCounter.getAndIncrement() + " : " + color + "\n"));
        stringBuilder.append("Title : " + title + "\n");
        stringBuilder.append("Precision : " + precision + "\n");
        stringBuilder.append("Showing percentage : " + showPercentage + "\n");
        stringBuilder.append("*************************\n");

        return stringBuilder.toString();
    }
}
