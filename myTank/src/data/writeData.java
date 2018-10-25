package data;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JButton;

public class writeData implements Serializable {
	
	public static void write(Object o, Object o2) {
		XMLEncoder exle = null;
	Object[] oa = new Object[2];
	oa[0] = o;
	oa[1] = o2;
	
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Test4.xml");
            ObjectOutputStream os = new ObjectOutputStream(fos); 
		//	exle.writeObject(new JButton("Hello, world"));
			os.writeObject(oa);
			System.out.println(oa.toString());
 		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}



