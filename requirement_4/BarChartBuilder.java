package requirement_4;

import java.util.ArrayList;

public class BarChartBuilder implements ChartBuilder {
    private int width;
    private int height;
    private ArrayList<String> colors;
    private String title;
    private boolean showValues = false;
    private boolean isHistogram = false;
    private final ChartType chartType = ChartType.BAR;

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void setShowValues(boolean showValues) {
        this.showValues = showValues;
    }

    public void setHistogram(boolean histogram) {
        isHistogram = histogram;
    }

    protected BarChart getChart() {
        return new BarChart(width, height, colors, title, showValues, isHistogram);
    }
}
