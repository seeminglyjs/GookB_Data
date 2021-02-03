package java13_io_20day.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		// ��� ��� ����
		File file = new File("./src/java13_io_20day/filterStream/bufferedOut.txt");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file,true);
			// true�� �־��ָ� ���Ӱ� �����͸� �־��ִ� ���̾ƴ�
			// ������ �����Ϳ� �߰����ְ� �ȴ�.
			bos = new BufferedOutputStream(fos);			
			
			String data = "Hi";
			bos.write(data.getBytes(), 0, data.length());
			// ���Ͽ� �ش� �����Ͱ� ��µȴ�.
			bos.flush(); // ���ۺ���
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}















