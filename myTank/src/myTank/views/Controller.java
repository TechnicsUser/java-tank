package myTank.views;
import javax.swing.JFrame;
import javax.swing.JPanel;

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