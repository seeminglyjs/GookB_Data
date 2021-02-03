package java13_io_20day.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		// 출력 대상 파일
		File file = new File("./src/java13_io_20day/filterStream/bufferedOut.txt");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file,true);
			// true를 넣어주면 새롭게 데이터를 넣어주는 것이아닌
			// 기존에 데이터에 추가해주게 된다.
			bos = new BufferedOutputStream(fos);			
			
			String data = "Hi";
			bos.write(data.getBytes(), 0, data.length());
			// 파일에 해당 데이터가 출력된다.
			bos.flush(); // 버퍼비우기
			
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















