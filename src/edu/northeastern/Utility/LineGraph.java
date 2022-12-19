/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Utility;

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author satyajitdas
 */
public class LineGraph extends javax.swing.JPanel {

    private final DefaultCategoryDataset dataset;
    private String title;
    private String xAxisLabel;
    private String yAxisLabel;

    public LineGraph(String chartTitle, String xAxisLabel, String yAxisLabel, DefaultCategoryDataset dataset) {
        this.dataset = dataset;
        this.title = chartTitle;
        this.xAxisLabel = xAxisLabel;
        this.yAxisLabel = yAxisLabel;
    }

    public JPanel getGraph() {
//      super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(
                title,
                xAxisLabel, yAxisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        return chartPanel;
//      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
//      setContentPane( chartPanel );
    }
}

