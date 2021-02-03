package java13_io_20day.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		
		//입력
		File file = new File("./src/java13_io_20day/fileStream/input");
		System.out.println("파일존재여부 -> " + file.exists()); 

		byte [] buf = new byte[8];
		int len = -1;
		StringBuilder sb = new StringBuilder();
		
		//파일 출력 스트림 객체
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			while((len = is.read(buf)) != -1) {
				String temp = new String(buf, 0, len);
				System.out.println("들어가는 데이터- > " + temp);
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
