package java13_io_20day.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex05_2_ObjectIntputStream {

	public static void main(String[] args) {
		File file = new File("./src/java13_io_20day/filterStream/objectTest.txt");	
	
	
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new BufferedInputStream
					(new FileInputStream(file)));
			
			Object obj1 = ois.readObject();
			Point p1 = (Point) obj1;
			Point p2 = (Point) ois.readObject();
			Point p3 = (Point) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
