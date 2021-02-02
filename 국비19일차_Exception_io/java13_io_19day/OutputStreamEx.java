package java13_io_19day;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {

		OutputStream os = System.out;

		byte [] buf = new byte [10];
		// ��µ����� �����
		int len = 0;
		// ����� �������� ����

		buf[len++] = 'a';
		buf[len++] = 'b';
		buf[len++] = 'c';
		buf[len++] = 'd';
		buf[len++] = 'f';
		buf[len++] = '\n';

		try {
			os.write(buf, 0, len);
			// ���ۿ� ����Ѵ�.
			os.flush();
			// ��� ���۸� ����.
			// ���ۿ� ����� ������ ���
			// ��ġ���� ��������.
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
				// ��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
