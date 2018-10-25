package myTank.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paramaters extends JPanel{

	private JPanel frame;
	   Controller controller ;

	private JTextField txtSalinity;
	private JTextField txtAlkalinity;
	private JTextField txtCalcium;
	private JTextField txtMagnesium;
	private JTextField txtPhosphate;
	private JTextField txtNitrate;
	

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
		lblAlkalinty.setBounds(38, 79, 46, 14);
	 add(lblAlkalinty);
		
		JLabel lblCalcium = new JLabel("Calcium");
		lblCalcium.setBounds(38, 104, 46, 14);
	 add(lblCalcium);
		
		JLabel lblMagnesium = new JLabel("Magnesium");
		lblMagnesium.setBounds(38, 129, 85, 14);
	 add(lblMagnesium);
		
		JLabel lblPhosphate = new JLabel("Phosphate");
		lblPhosphate.setBounds(38, 166, 69, 14);
	 add(lblPhosphate);
		
		JLabel lblNitrate = new JLabel("Nitrate");
		lblNitrate.setBounds(38, 194, 46, 14);
	 add(lblNitrate);
		
		JLabel lblSalinity = new JLabel("Salinity");
		lblSalinity.setBounds(38, 54, 46, 14);
	 add(lblSalinity);
		
		txtSalinity = new JTextField();
		txtSalinity.setBounds(94, 51, 86, 20);
	 add(txtSalinity);
		txtSalinity.setColumns(10);
		
		txtAlkalinity = new JTextField();
		txtAlkalinity.setBounds(94, 76, 86, 20);
	 add(txtAlkalinity);
		txtAlkalinity.setColumns(10);
		
		txtCalcium = new JTextField();
		txtCalcium.setBounds(94, 101, 86, 20);
	 add(txtCalcium);
		txtCalcium.setColumns(10);
		
		txtMagnesium = new JTextField();
		txtMagnesium.setBounds(94, 126, 86, 20);
	 add(txtMagnesium);
		txtMagnesium.setColumns(10);
		
		txtPhosphate = new JTextField();
		txtPhosphate.setBounds(94, 163, 86, 20);
	 add(txtPhosphate);
		txtPhosphate.setColumns(10);
		
		txtNitrate = new JTextField();
		txtNitrate.setBounds(94, 191, 86, 20);
	 add(txtNitrate);
		txtNitrate.setColumns(10);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showMain( );

			}
		});
		btnHome.setBounds(10, 239, 89, 23);
		add(btnHome);
	}
}
