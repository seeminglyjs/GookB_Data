package java13_io_20day.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		
		//�Է�
		File file = new File("./src/java13_io_20day/fileStream/input");
		System.out.println("�������翩�� -> " + file.exists()); 

		byte [] buf = new byte[8];
		int len = -1;
		StringBuilder sb = new StringBuilder();
		
		//���� ��� ��Ʈ�� ��ü
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			while((len = is.read(buf)) != -1) {
				String temp = new String(buf, 0, len);
				System.out.println("���� ������- > " + temp);
				sb.append(temp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sb);
	}

}
