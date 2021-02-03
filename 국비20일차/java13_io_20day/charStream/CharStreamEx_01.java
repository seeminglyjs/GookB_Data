package java13_io_20day.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {

	public static void main(String[] args) {
		// 문자 스트림, Character Stream
		// 문자(char, 2b) 단위로 통신하는 스트림
		
		// 기본 스트림은 1b 단위로 통신하기 시작한다.
		// 바이트스트림 -> 문자스트림으로 변환해서 사용한다.
		
		// InputStreamReader : InputStream - > Reader 변환
		// OutputStreamReader : OutputStream - > Writer	변환	
		
		// 문자스트림을 이용하여 키보드 입력을 모니터 출력으로 내보내기
		
		Reader reader = new InputStreamReader(System.in);
		Writer writer = new OutputStreamWriter(System.out);
	
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			while((len = reader.read(cbuf)) != -1){
				writer.write(cbuf, 0, len);
				writer.flush();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	}

}
