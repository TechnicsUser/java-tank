package data;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.DefaultListModel;

public class readData implements Serializable {
	static Object[] model = new Object[2] ;
 	@SuppressWarnings("unchecked")
	public static  Object[] read()  {
		
	
	try ( FileInputStream fis = new FileInputStream("C:\\Test4.xml");
            ObjectInputStream in = new ObjectInputStream(fis)) 

			
 {
//	   for(int i = 0; i <2; i++)
//	    	 {
			Object s =  in.readObject();
		//	if(s instanceof DefaultListModel<?>) {
				model =(Object[]) s;
				System.out.println(s);
			 PriorityQueue<String> pq = new PriorityQueue<String>();
			pq.add("test");
			LinkedHashSet<Object> se = new LinkedHashSet<>();
		
	//	}
		//}
	
     }
	catch(EOFException e) {} 
	catch (IOException e) {
         System.out.println("Exception deserializing " + ": " + e);
         System.exit(-1);
     }
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return model;

}
}