package myTank.views;

import javax.swing.JPanel;
import javax.swing.JButton;

public class testView extends JPanel {

	/**
	 * Create the panel.
	 */
	public testView() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(35, 73, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(35, 122, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(35, 176, 89, 23);
		add(btnNewButton_2);

	}
}
