package java13_io_20day.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_02 {

	public static void main(String[] args) {
		
		// 입출력 문자 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw = new PrintWriter(new BufferedWriter
				(new OutputStreamWriter(System.out)), true);
		// 두번째 매개값으로 true를 넣어주면 Autoflush가 된다.
				
		String str = null;
		try {
			while((str = br.readLine()) != null) {
				pw.println(str);
				//pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
