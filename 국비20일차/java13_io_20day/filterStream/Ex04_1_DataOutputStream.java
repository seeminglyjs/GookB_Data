package java13_io_20day.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {

	public static void main(String[] args) {
		File file = new File("./src/java13_io_20day/filterStream/dataTest.txt");
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new BufferedOutputStream
					(new FileOutputStream(file)));
			// 기본 버퍼 스트림으로 받기 위해서 파일스트림을 매개값으로
			// 넣어 주었다.
			
			String temp = "hi";
			dos.writeBoolean(true);
			dos.writeChar('가');
			dos.writeInt(123);
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
