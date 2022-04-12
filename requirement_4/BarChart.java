package requirement_4;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BarChart {
    private int width;
    private int height;
    private List<String> colors;
    private String title;
    private boolean showValues;
    private boolean isHistogram;

    public BarChart(int width, int height, List<String> colors, String title, boolean showValues, boolean isHistogram) {
        this.width = width;
        this.height = height;
        this.colors = colors;
        this.title = title;
        this.showValues = showValues;
        this.isHistogram = isHistogram;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*************************\n");
        stringBuilder.append("This is a bar chart\n");
        stringBuilder.append("Width : " + width + "\n");
        stringBuilder.append("Height : " + height + "\n");
        AtomicInteger colorCounter = new AtomicInteger(1);
        colors.forEach(color -> stringBuilder.append("Color " + colorCounter.getAndIncrement() + " : " + color + "\n"));
        stringBuilder.append("Title : " + title + "\n");
        stringBuilder.append("Showing values : " + showValues + "\n");
        stringBuilder.append("Histogram format : " + isHistogram + "\n");
        stringBuilder.append("*************************\n");

        return stringBuilder.toString();
    }
}
