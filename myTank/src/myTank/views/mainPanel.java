package myTank.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;
import com.toedter.components.JLocaleChooser;

import data.writeData;

public class mainPanel extends JPanel {
	private final JPanel contentPanel = new JPanel();
	/**
	 * Create the panel.
	 */
	public mainPanel(Controller controller) {
		
		JCalendar d = new JCalendar(new Date());
		d.setBounds(16, 58, 350, 230);

		add(d);
	   
 
		JButton btnParamaters = new JButton("Paramaters");
		btnParamaters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showParam();

			}
		});
		setLayout(null);
		btnParamaters.setBounds(7, 10, 89, 23);
		add(btnParamaters);
		
		JButton btnNewLivestock = new JButton("New livestock");
		btnNewLivestock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showLivestock( );

			}
		});
		btnNewLivestock.setBounds(101, 10, 99, 23);
		add(btnNewLivestock);
		
		JButton btnMaintanance = new JButton("Maintanance");
		btnMaintanance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.showMaintanance( );
 
			}
		});
		btnMaintanance.setBounds(205, 10, 95, 23);
		add(btnMaintanance);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(205, 142, 127, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						writeData.write(d.getDate().toString(),d.getDate().toString());
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
 			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	

	}
}
