package myTank.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;

public class paramaters extends JPanel{

	private JPanel frame;
	   Controller controller ;

	private JTextField txtSalinity;
	private JTextField txtAlkalinity;
	private JTextField txtCalcium;
	private JTextField txtMagnesium;
	private JTextField txtPhosphate;
	private JTextField txtNitrate;
	private JTextField txtSalinityPrevious;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JSeparator separator;
	private JTextField txtTemp;
	private JTextField textField_7;
	private JButton btnSave;
	private JPanel chartPanel;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					paramaters window = new paramaters();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public paramaters(Controller controller2) {
		setBackground(new Color(204, 204, 255));
	      controller = controller2;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JPanel();
		frame.setBounds(100, 100, 450, 300);
 	 setLayout(null);
		
		JLabel lblAlkalinty = new JLabel("Alkalinty");
		lblAlkalinty.setBounds(38, 110, 46, 14);
	 add(lblAlkalinty);
		
		JLabel lblCalcium = new JLabel("Calcium");
		lblCalcium.setBounds(38, 135, 46, 14);
	 add(lblCalcium);
		
		JLabel lblMagnesium = new JLabel("Magnesium");
		lblMagnesium.setBounds(38, 160, 85, 14);
	 add(lblMagnesium);
		
		JLabel lblPhosphate = new JLabel("Phosphate");
		lblPhosphate.setBounds(38, 197, 69, 14);
	 add(lblPhosphate);
		
		JLabel lblNitrate = new JLabel("Nitrate");
		lblNitrate.setBounds(38, 225, 46, 14);
	 add(lblNitrate);
		
		JLabel lblSalinity = new JLabel("Salinity");
		lblSalinity.setBounds(38, 54, 46, 14);
	 add(lblSalinity);
		
		txtSalinity = new JTextField();
		txtSalinity.setBounds(124, 49, 86, 23);
	 add(txtSalinity);
		txtSalinity.setColumns(10);
		
		txtAlkalinity = new JTextField();
		txtAlkalinity.setBounds(124, 110, 86, 23);
	 add(txtAlkalinity);
		txtAlkalinity.setColumns(10);
		
		txtCalcium = new JTextField();
		txtCalcium.setBounds(124, 135, 86, 23);
	 add(txtCalcium);
		txtCalcium.setColumns(10);
		
		txtMagnesium = new JTextField();
		txtMagnesium.setBounds(124, 160, 86, 23);
	 add(txtMagnesium);
		txtMagnesium.setColumns(10);
		
		txtPhosphate = new JTextField();
		txtPhosphate.setBounds(124, 197, 86, 23);
	 add(txtPhosphate);
		txtPhosphate.setColumns(10);
		
		txtNitrate = new JTextField();
		txtNitrate.setBounds(124, 225, 86, 23);
	 add(txtNitrate);
		txtNitrate.setColumns(10);
		
		JButton btnHome = new JButton("Home");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(new Color(255, 153, 51));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(new Color(214, 227, 213));

			}
		});
		btnHome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//setBackground(new Color(255, 153, 51));

			}
		});
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showMain( );

			}
		});
		btnHome.setBounds(6, 6, 89, 23);
		add(btnHome);
		
		txtSalinityPrevious = new JTextField();
		txtSalinityPrevious.setColumns(10);
		txtSalinityPrevious.setBounds(239, 49, 86, 23);
		add(txtSalinityPrevious);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(239, 110, 86, 23);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(239, 135, 86, 23);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(239, 160, 86, 23);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(239, 197, 86, 23);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(239, 225, 86, 23);
		add(textField_5);
		
		JLabel lblNew = new JLabel("New");
		lblNew.setBounds(139, 23, 46, 14);
		add(lblNew);
		
		JLabel lblPrevious = new JLabel("Last Reading");
		lblPrevious.setBounds(239, 23, 78, 14);
		add(lblPrevious);
		
		JLabel lblCurrentdate = new JLabel("CurrentDate");
		lblCurrentdate.setBounds(323, 280, 121, 14);
		add(lblCurrentdate);
		
		separator = new JSeparator();
		separator.setBounds(38, 186, 287, 14);
		add(separator);
		
		JLabel lblTemp = new JLabel("Temp");
		lblTemp.setBounds(38, 80, 55, 16);
		add(lblTemp);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 102, 287, 14);
		add(separator_1);
		
		txtTemp = new JTextField();
		txtTemp.setColumns(10);
		txtTemp.setBounds(124, 73, 86, 23);
		add(txtTemp);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(239, 73, 86, 23);
		add(textField_7);
		
		JButton btnMore = new JButton("More");
		btnMore.setBackground(new Color(255, 153, 51));
		btnMore.setBounds(33, 251, 90, 28);
		add(btnMore);
		
		JButton btnPrevious = new JButton("Previous ");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showChart( );

			}
		});
		btnPrevious.setBounds(239, 251, 90, 28);
		add(btnPrevious);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(124, 251, 90, 28);
		add(btnSave);
	    chartPanel = new XChartPanel<XYChart>(controller.getChart());
	    chartPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    chartPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
 	    chartPanel.setBounds(337, 49, 90, 33);

	     add(chartPanel);  

//		JInternalFrame internalFrame = new JInternalFrame();
//		internalFrame.setBounds(359, 54, 104, 120);
//		internalFrame.add(chartPanel);
// 		add(internalFrame);
//		internalFrame.setVisible(true);
	
	 
		
	}
}
