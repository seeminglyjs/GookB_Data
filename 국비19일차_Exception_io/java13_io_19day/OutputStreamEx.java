package java13_io_19day;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {

		OutputStream os = System.out;

		byte [] buf = new byte [10];
		// 출력데이터 저장소
		int len = 0;
		// 출력할 데이터의 길이

		buf[len++] = 'a';
		buf[len++] = 'b';
		buf[len++] = 'c';
		buf[len++] = 'd';
		buf[len++] = 'f';
		buf[len++] = '\n';

		try {
			os.write(buf, 0, len);
			// 버퍼에 기록한다.
			os.flush();
			// 출력 버퍼를 비운다.
			// 버퍼에 저장된 내용을 출력
			// 장치까지 내보낸다.
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
				// 스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
