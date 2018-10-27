package myTank.views;


import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import data.readData;
import data.writeData;

import java.awt.Color;
 
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.UIManager.*;
import java.awt.Font;

public class maintanance extends JPanel {

	private JPanel frame;
	private JTextField txtAdd;
	   Controller controller ;
		DefaultListModel<String> model = new DefaultListModel<>();
		DefaultListModel<String> model2 = new DefaultListModel<>();

		Object[] oa = new  Object[2];



	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					maintanance window = new maintanance();
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
	public maintanance() {
		initialize();
	}

	public maintanance(Controller c) {
	      controller = c;
	      oa = readData.read();
	      model = (DefaultListModel<String>) oa[0];
	      model2 = (DefaultListModel<String>) oa[1];
			initialize();

		// TODO Auto-generated constructor stub
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		frame = new JPanel();
		frame.setBounds(400, 400, 450, 300);
		setLayout(null);


		JComboBox comAdd = new JComboBox();
		comAdd.setBounds(207, 56, 111, 32);
		comAdd.setModel(new DefaultComboBoxModel(new String[] {"Weekly", "Monthly", "Bi-Monthly"}));
		 add(comAdd);
		 
		 
 

		JList<String> lstToDo = new JList<String>(model);
		lstToDo.setBounds(10, 121, 179, 153);
		lstToDo.setBackground(Color.YELLOW);
		lstToDo.setBorder(new LineBorder(new Color(0, 50, 0), 1, true));
		 add(lstToDo);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(328, 56, 68, 32);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newToDo = txtAdd.getText() + " " +  String.valueOf(comAdd.getSelectedItem());
				model.addElement(newToDo);
				System.out.println(newToDo);
				}
		});
		 add(btnAdd);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(10, 55, 179, 41);
		 add(txtAdd);
		txtAdd.setColumns(10);
		
		JList<String> lstCompleated = new JList<String>(model2);
		lstCompleated.setBounds(291, 121, 179, 153);
		lstCompleated.setBackground(Color.GREEN);
		lstCompleated.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		 add(lstCompleated);
		
		JLabel lblToDo = new JLabel("To Do  ");
		lblToDo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblToDo.setBounds(66, 99, 104, 19);
		 add(lblToDo);
		
		JLabel lblCompleated = new JLabel("Compleated  ");
		lblCompleated.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCompleated.setBounds(310, 95, 195, 23);
		 add(lblCompleated);
		
		JButton btnRight = new JButton("\u21E8");
		btnRight.setForeground(new Color(0, 0, 255));
		btnRight.setFont(btnRight.getFont().deriveFont(btnRight.getFont().getStyle() | Font.BOLD, 26f));
		btnRight.setBounds(207, 121, 59, 47);
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int toMoveIndex = lstToDo.getLeadSelectionIndex();
				String toMove = model.get(toMoveIndex);
				model.remove(toMoveIndex);
				model2.addElement(toMove);
 
			}
		});
		 add(btnRight);
		
		JButton btnLeft = new JButton("\u21E6");
		btnLeft.setForeground(new Color(0, 0, 255));
		btnLeft.setFont(btnLeft.getFont().deriveFont(btnLeft.getFont().getStyle() | Font.BOLD, 26f));
		btnLeft.setBounds(207, 179, 59, 47);
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				int toMoveIndex = lstCompleated.getLeadSelectionIndex();
				String toMove = model2.get(toMoveIndex);
				model2.remove(toMoveIndex);
				model.addElement(toMove);
			}
		});
		 add(btnLeft);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnX.setForeground(new Color(255, 0, 0));
		btnX.setBounds(207, 240, 59, 34);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 	if (!lstCompleated.isSelectionEmpty()) {
					int toMoveIndex = lstCompleated.getLeadSelectionIndex();
					String toMove = model2.get(toMoveIndex);
					model2.remove(toMoveIndex);
				}	
			 	if (!lstToDo.isSelectionEmpty()) {
					int toMoveIndex = lstToDo.getLeadSelectionIndex();
					String toMove = model.get(toMoveIndex);
					model.remove(toMoveIndex);
				}
			}
		});
		 add(btnX);
		 
		 JButton btnHome = new JButton("Home");
		 btnHome.setBounds(10, 7, 89, 23);
		 btnHome.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		writeData.write(model, model2);

		 		controller.showMain( );

		 	}
		 });
		 add(btnHome);
		

	}
}
