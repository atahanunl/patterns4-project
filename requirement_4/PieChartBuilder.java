package requirement_4;

import java.util.ArrayList;

public class PieChartBuilder implements ChartBuilder {
    private int width;
    private int height;
    private ArrayList<String> colors;
    private String title;
    private int precision = 2;
    private boolean showPercentage = true;
    private final ChartType chartType = ChartType.PIE;

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

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void setShowPercentage(boolean showPercentage) {
        this.showPercentage = showPercentage;
    }

    protected PieChart getChart() {
        return new PieChart(width, height, colors, title, precision, showPercentage);
    }
}
