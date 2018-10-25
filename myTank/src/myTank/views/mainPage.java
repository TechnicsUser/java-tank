package myTank.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class mainPage extends JFrame {

	/**
	 * test
	 */
	private static final long serialVersionUID = 1L;
	   Controller controller = new Controller(this) ;

	private final JPanel contentPanel = new mainPanel(controller);
	   mainPage dialog ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			mainPage dialog = new mainPage();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public mainPage() {
		setBounds(100, 100, 560, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
 controller.showMain();
 }
}
