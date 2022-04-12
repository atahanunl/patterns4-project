package requirement_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {
    protected void createBigPieChart(ChartBuilder chartBuilder) {
        chartBuilder.setWidth(800);
        chartBuilder.setHeight(800);
        chartBuilder.setColors(new ArrayList<>(Arrays.asList("Red", "Green", "Blue")));
        chartBuilder.setTitle("Big Pie Chart");
    }

    protected void createSmallPieChart(ChartBuilder chartBuilder) {
        chartBuilder.setWidth(400);
        chartBuilder.setHeight(400);
        chartBuilder.setColors(new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow")));
        chartBuilder.setTitle("Small Pie Chart");
    }

    protected void createBigBarChart(ChartBuilder chartBuilder) {
        chartBuilder.setWidth(800);
        chartBuilder.setHeight(800);
        chartBuilder.setColors(new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Magenta", "Cyan")));
        chartBuilder.setTitle("Big Bar Chart");
    }

    protected void createSmallBarChart(ChartBuilder chartBuilder) {
        chartBuilder.setWidth(600);
        chartBuilder.setHeight(600);
        chartBuilder.setColors(new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow")));
        chartBuilder.setTitle("Small Pie Chart");
    }
}
