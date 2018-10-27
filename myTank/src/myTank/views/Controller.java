package myTank.views;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.style.Styler.LegendPosition;

import myTank.views.maintanance;
import myTank.views.newLivestock;

class Controller
{
	JFrame frame;
     maintanance maintanance =  new maintanance(this);
   newLivestock livestock = new newLivestock(this);
   mainPanel mainPanel = new mainPanel(this);
   paramaters  paramaters  = new paramaters(this); 
   // Constructor
   public Controller(JFrame frame)
   {
       this.frame=frame;
   }
   public XYChart getChart() {

	    // generates Log data
	    List<Integer> xData = new ArrayList<Integer>();
	    List<Double> yData = new ArrayList<Double>();
	    for (int i = -3; i <= 300; i++) {
	      xData.add(i);
	      yData.add(Math.pow(10, i));
	    }

	    // Create Chart
	    XYChart chart =
	        new XYChartBuilder()
	            .width(90)
	            .height(33)
//	            .title("Powers of Ten")
//	            .xAxisTitle("Power")
//	            .yAxisTitle("Value")
	            .build();

	    // Customize Chart
//	    chart.getStyler().setChartTitleVisible(true);
//	    chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
//	    chart.getStyler().setYAxisLogarithmic(true);
//	    chart.getStyler().setXAxisLabelRotation(45);

	    // chart.getStyler().setXAxisLabelAlignment(TextAlignment.Right);
	    // chart.getStyler().setXAxisLabelRotation(90);
	    // chart.getStyler().setXAxisLabelRotation(0);

	    // Series
	    chart.addSeries("10^x", xData, yData);

	    return chart;
	  }
  
   public void showChart( )
   {
		double[] xData = new double[] { 1, 2, 3,4, 5, 6,7,8,9 };
		double[] yData = new double[] {  34.5, 34.0, 35.0,34.5, 34.0, 35.0,34.5, 34.0, 35.0  };

		// Create Chart
		XYChart chart = QuickChart.getChart("Salinity", "X", "Y", "y(x)", xData, yData);

		// Show it
	//	new SwingWrapper(chart).displayChart(getName());
		   // chart
	    JPanel chartPanel = new XChartPanel<XYChart>(chart);
	    
	  //  add(chartPanel);
	   JPanel contentPane = (JPanel) frame.getContentPane();

	   
	   contentPane.removeAll();
	   contentPane.add(chartPanel);
 
	   contentPane.revalidate(); 
	   contentPane.repaint();

   }   
   public void showMain( )
   {
	   JPanel contentPane = (JPanel) frame.getContentPane();

	   contentPane.removeAll();
	   contentPane.add(new mainPanel(this));
	   contentPane.revalidate(); 
	   contentPane.repaint();

   } 
   public void showMaintanance( )
   {
	   JPanel contentPane = (JPanel) frame.getContentPane();

	   contentPane.removeAll();
	   contentPane.add( new maintanance(this));
	   contentPane.revalidate(); 
	   contentPane.repaint();

   }
   public void showLivestock( )
   {
	   JPanel contentPane = (JPanel) frame.getContentPane();

	   contentPane.removeAll();
	   contentPane.add(new newLivestock(this));
	   contentPane.revalidate(); 
	   contentPane.repaint();

   }
   public void showParam( )
   {
	   JPanel contentPane = (JPanel) frame.getContentPane();

	   contentPane.removeAll();
	   contentPane.add(new paramaters(this));
	   contentPane.revalidate(); 
	   contentPane.repaint();

   }
}