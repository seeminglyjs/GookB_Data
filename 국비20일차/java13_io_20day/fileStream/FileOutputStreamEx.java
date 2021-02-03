package java13_io_20day.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		File file = new File("./src/java13_io_20day/fileStream/output");
		System.out.println("파일존재여부 -> " + file.exists()); 


		//파일 출력 스트림 객체
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			String str = "Apple";
			os.write(str.getBytes(),0 ,str.length());
			os.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
