package myTank.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;


 import myTank.Coral;
import myTank.Fish;
import myTank.Frag;
import myTank.Invert;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.List;

public class newLivestock extends JPanel
{

	private JPanel frame;
	private JTextField txtName;
	private JTextField textFieldPurchasedOn;
	private JTextField txtPrice;
	private JTextField txtLocation;
	private JTextField txtQuantity;
	private JTextField txtTypeOther;
	private JComboBox<?> comQuality;
	 List list = new List();

	JComboBox cbCoralType = new JComboBox();
	JLabel lblPurchased = new JLabel("Purchased");
	JLabel lblLocation = new JLabel("Location");
	JComboBox cbMountedTo = new JComboBox();
	JLabel lblMountedTo = new JLabel("Mounted To");
	JLabel lblPrice = new JLabel("Cost");
	   Controller controller = null;







	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					newLivestock window = new newLivestock();
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
 

	public newLivestock(Controller controller2) {
	      controller = controller2;
			initialize();

		// TODO Auto-generated constructor stub
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JPanel();
		frame.setBounds(100, 100, 450, 300);
 		
		txtName = new JTextField();
		txtName.setBounds(113, 26, 86, 23);
		txtName.setColumns(10);
		
		txtTypeOther = new JTextField();
		txtTypeOther.setBounds(247, 55, 114, 23);
	 add(txtTypeOther);
		txtTypeOther.setColumns(10);
 		txtTypeOther.setVisible(false);

 		JComboBox<?> comSize = new JComboBox<Object>();
		comSize.setModel(new DefaultComboBoxModel(new String[] {"Small", "Medium", "Large"}));
		comSize.setBounds(203, 142, 91, 25);
		
		cbCoralType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
		 	if(String.valueOf(cbCoralType.getSelectedItem()).equals("Other")) {
		 		txtTypeOther.setVisible(true);
			 }
		 	else {
		 		txtTypeOther.setVisible(false);

		 	}
				
			}
		});
		cbCoralType.setModel(new DefaultComboBoxModel(new String[] {"Soft", "Lps", "Sps", "Other"}));
		cbCoralType.setBounds(247, 28, 63, 25);
	 add(cbCoralType);
		cbCoralType.setVisible(false);
		
		JComboBox<?> comType = new JComboBox<Object>();
		comType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(String.valueOf(comType.getSelectedItem()).equals("Fish" )) setFishDisplay();
				if(String.valueOf(comType.getSelectedItem()).equals("Coral" ))setCoralDisplay();
				if(String.valueOf(comType.getSelectedItem()).equals("Invert" ))setInvertDisplay();
				if( String.valueOf(comType.getSelectedItem()).equals("Frag" ))setFragDisplay();
				
			
			}
		});
		comType.setModel(new DefaultComboBoxModel(new String[] {"Fish", "Coral",  "Invert", "Frag"}));
		comType.setBounds(113, 54, 86, 22);
		
		JLabel lblPurchaseDate = new JLabel("On"); 
		lblPurchaseDate.setBounds(20, 113, 36, 20);
 		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(10, 57, 55, 16);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 28, 55, 16);
		
		textFieldPurchasedOn = new JTextField();
		textFieldPurchasedOn.setBounds(54, 113, 86, 23);
		textFieldPurchasedOn.setColumns(10);
		
		JLabel lblQuality = new JLabel("Quality");
		lblQuality.setBounds(10, 146, 55, 16);
		
		comQuality = new JComboBox<Object>();
		((JLabel)comQuality.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
		comQuality.setModel(new DefaultComboBoxModel(new String[] {"Poor", "Ok", "Good", "Excellent"}));
		comQuality.setBounds(54, 142, 86, 25);
		
		lblPrice.setBounds(330, 115, 55, 16);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(367, 113, 55, 23);
		txtPrice.setColumns(10);
		
		lblPurchased.setBounds(10, 97, 104, 16);
		
		lblLocation.setBounds(148, 115, 55, 16);
		
		txtLocation = new JTextField();
		txtLocation.setToolTipText("location");
		txtLocation.setBounds(203, 113, 114, 23);
		txtLocation.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(306, 146, 55, 17);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(367, 144, 55, 23);
		txtQuantity.setColumns(10);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(148, 146, 55, 16);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(363, 251, 56, 26);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(String.valueOf(comType.getSelectedItem()).equals("Fish")) {
					Fish f = new Fish(String.valueOf(txtName.getText()),String.valueOf(textFieldPurchasedOn.getText()), 
							Double.parseDouble(txtPrice.getText()), String.valueOf(txtLocation.getText()),
							String.valueOf(comQuality), Integer.parseInt(txtQuantity.getText()), String.valueOf(comSize.getSelectedItem()) );
				//	LivestockController.add(f);
					list.add(f.toString());
					list.add(txtName.getText());
					list.add(textFieldPurchasedOn.getText());
					list.add(txtPrice.getText());
					list.add(txtLocation.getText());
		
					list.add(comQuality.getSelectedItem().toString());
					list.add(txtQuantity.getText());
					list.add(comSize.getSelectedItem().toString());

					
					txtName.setText(txtName.getText());
				}
				if(String.valueOf(comType.getSelectedItem()).equals("Coral")) {
 					Coral c = new Coral(String.valueOf(txtName),String.valueOf(textFieldPurchasedOn),
 							Double.parseDouble(txtPrice.getText()), String.valueOf(txtLocation),
							String.valueOf(comQuality), Integer.parseInt(txtQuantity.getText()), String.valueOf(comSize), null, null);
					LivestockController.add(c);

					txtName.setText(c.toString());
					
				}
				if(String.valueOf(comType.getSelectedItem()).equals("Invert")) {
					Invert i = new Invert(String.valueOf(txtName),String.valueOf(textFieldPurchasedOn),
							Double.parseDouble(txtPrice.getText()), String.valueOf(txtLocation),
							String.valueOf(comQuality), Integer.parseInt(txtQuantity.getText()), String.valueOf(comSize) );
					LivestockController.add(i);

					txtName.setText(i.toString());
  				}
				if(String.valueOf(comType.getSelectedItem()).equals("Frag")) {
					Frag i = new Frag(String.valueOf(txtName),String.valueOf(textFieldPurchasedOn),
							Double.parseDouble(txtPrice.getText()), String.valueOf(txtLocation),
							String.valueOf(comQuality), Integer.parseInt(txtQuantity.getText()), String.valueOf(comSize) );
					LivestockController.add(i);

					txtName.setText(i.toString());
  				}
			}
		});
	 setLayout(null);
	 add(btnAdd);
	 add(lblName);
	 add(txtName);
	 add(lblType);
	 add(comType);
	 add(lblPurchased);
	 add(textFieldPurchasedOn);
	 add(lblPurchaseDate);
	 add(lblPrice);
	 add(txtPrice);
	 add(lblLocation);
	 add(txtLocation);
	 add(comQuality);
	 add(lblQuality);
	 add(txtQuantity);
	 add(lblQuantity);
	 add(lblSize);
	 add(comSize);
		
		lblMountedTo.setBounds(15, 226, 86, 16);
	 add(lblMountedTo);
		lblMountedTo.setVisible(false);
		
		cbMountedTo.setModel(new DefaultComboBoxModel(new String[] {"Live Rock(no coraline)", "Live Rock", "Frag Plug(printed)", "Frag Plug"}));
		cbMountedTo.setBounds(113, 222, 158, 25);
	 add(cbMountedTo);
	 
	 JButton btnHome = new JButton("Home");
	 btnHome.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
			controller.showMain( );

	 	}
	 });
	 btnHome.setBounds(25, 253, 89, 23);
	 add(btnHome);
	 
	 list.setBounds(191, 267, 124, 64);
	 add(list);
	 list.add("test");
 		cbMountedTo.setVisible(false);
		
	

	}
	public void setFishDisplay() {
		cbCoralType.setVisible(false);
		lblPurchased.setText("Purchased");
		lblLocation.setText("Location");
		lblMountedTo.setVisible(false);
		cbMountedTo.setVisible(false);		
		txtLocation.setBounds(203, 113, 114, 20);
		lblPrice.setText("Cost");
		lblPrice.setBounds(330, 115, 55, 16);



	}
	public void setCoralDisplay() {
		cbCoralType.setVisible(true);
		lblPurchased.setText("Purchased");
		lblLocation.setText("Location");
		lblMountedTo.setVisible(false);
		cbMountedTo.setVisible(false);
		txtLocation.setBounds(203, 113, 114, 20);
		lblPrice.setText("Cost");
		lblPrice.setBounds(330, 115, 55, 16);


	}
	public void setInvertDisplay() {
		cbCoralType.setVisible(false);
		lblPurchased.setText("Purchased");
		lblLocation.setText("Location");
		lblMountedTo.setVisible(false);
		cbMountedTo.setVisible(false);
		txtLocation.setBounds(203, 113, 114, 20);
		lblPrice.setText("Cost");
		lblPrice.setBounds(330, 115, 55, 16);


	}
	public void setFragDisplay() {
		cbCoralType.setVisible(true);
		lblPurchased.setText("  Cut");
		lblLocation.setText("Mother");
		lblMountedTo.setVisible(true);
		cbMountedTo.setVisible(true);
		txtLocation.setBounds(203, 113, 70, 20);
		lblPrice.setText("Sale Price");
		lblPrice.setBounds(290, 115, 75, 16);

	}
}
