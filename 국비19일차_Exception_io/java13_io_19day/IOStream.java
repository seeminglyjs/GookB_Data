package java13_io_19day;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {

	public static void main(String[] args) {

		InputStream is = System.in;
		OutputStream os = System.out;
		StringBuilder sb = new StringBuilder();

		byte [] buf = new byte[1024];
		// 주로 1kb를 사용한다.
		int len = -1;


		try { // EOF를 만날때 까지 반복 ctrl + z
			while((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
				os.flush();
				// 출력 버퍼 비우기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
