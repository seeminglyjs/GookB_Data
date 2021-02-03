package java13_io_20day.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedStream {

	public static void main(String[] args) {
		
		File file = new File("./src/java13_io_20day/filterStream/source.txt");
		System.out.println(file.exists());
		
		//FileInputStream fis = null; // 1�� ��Ʈ��
		BufferedInputStream bis = null; // 2�� ��Ʈ��, ����
		
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();

		byte [] buf = new byte[1024];
		int len = -1;
		
		try {
			// fis = new FileInputStream(file);
			bis = new BufferedInputStream(new FileInputStream(file));
			
			while((len = bis.read(buf)) != -1){
				String temp = new String(buf, 0, len);
				System.out.print(temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				// fis.close(); // ��Ʈ�� �ݱ�
				// ���� ���� �������� �ݾ��־�� �Ѵ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
