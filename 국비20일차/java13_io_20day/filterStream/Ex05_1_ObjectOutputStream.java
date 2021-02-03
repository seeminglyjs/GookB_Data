package java13_io_20day.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex05_1_ObjectOutputStream {

	public static void main(String[] args) {
		File file = new File("./src/java13_io_20day/filterStream/objectTest.txt");
		
		ObjectOutputStream oos = null;
		// ��ü�� ���� �� �ִ� Stream
		
		try {
			oos  = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		
			// ��ü ����
			Point p1 = new Point(11, 22);
			Point p2 = new Point(311, 522);
			Point p3 = new Point(141, 262);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush();// ���ۺ���
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
