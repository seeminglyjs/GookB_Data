package java13_io_20day.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {

	public static void main(String[] args) {
		// ���� ��Ʈ��, Character Stream
		// ����(char, 2b) ������ ����ϴ� ��Ʈ��
		
		// �⺻ ��Ʈ���� 1b ������ ����ϱ� �����Ѵ�.
		// ����Ʈ��Ʈ�� -> ���ڽ�Ʈ������ ��ȯ�ؼ� ����Ѵ�.
		
		// InputStreamReader : InputStream - > Reader ��ȯ
		// OutputStreamReader : OutputStream - > Writer	��ȯ	
		
		// ���ڽ�Ʈ���� �̿��Ͽ� Ű���� �Է��� ����� ������� ��������
		
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
