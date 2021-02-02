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
		// �ַ� 1kb�� ����Ѵ�.
		int len = -1;


		try { // EOF�� ������ ���� �ݺ� ctrl + z
			while((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
				os.flush();
				// ��� ���� ����
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
