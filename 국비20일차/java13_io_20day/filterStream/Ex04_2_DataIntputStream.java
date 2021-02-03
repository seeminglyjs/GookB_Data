package java13_io_20day.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_2_DataIntputStream {

	public static void main(String[] args) {
		File file = new File("./src/java13_io_20day/filterStream/dataTest.txt");
		
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new BufferedInputStream(
					new FileInputStream(file)));
			boolean data1 = dis.readBoolean();
			char data2 = dis.readChar();
			int data3 = dis.readInt();
			
			System.out.println(data1 + " / " + data2 + " / " + data3);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
