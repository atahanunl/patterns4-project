package requirement_4;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        PieChartBuilder pieChartBuilder = new PieChartBuilder();
        director.createBigPieChart(pieChartBuilder);
        PieChart bigPieChart = pieChartBuilder.getChart();
        System.out.println(bigPieChart);

        pieChartBuilder.setPrecision(5);
        pieChartBuilder.setShowPercentage(false);
        director.createSmallPieChart(pieChartBuilder);
        PieChart smallPieChart = pieChartBuilder.getChart();
        System.out.println(smallPieChart);

        BarChartBuilder barChartBuilder = new BarChartBuilder();
        director.createBigBarChart(barChartBuilder);
        BarChart bigBarChart = barChartBuilder.getChart();
        System.out.println(bigBarChart);

        barChartBuilder.setShowValues(true);
        barChartBuilder.setHistogram(true);
        director.createSmallBarChart(barChartBuilder);
        BarChart smallBarChart = barChartBuilder.getChart();
        System.out.println(smallBarChart);
    }
}
