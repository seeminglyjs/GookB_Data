package java13_io_19day;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		// in - > Ű���� ǥ�� �Է� ��Ʈ�� ��ü
		
		byte [] buf = new byte[10]; 
		// read�� �Ű� ����
		int len = -1; // �Է¹��� �������� ����
		// read �޼ҵ��� ��ȯ������ -1 EOF��
		// ��Ÿ���� Ư���� ������ ����
		
		StringBuilder sb = new StringBuilder();
		// �Է� ������ ��ü ���� �뵵
		
		System.out.println("========== �Է´����");
		try {
			while((len = is.read(buf)) != -1) {
//				System.out.println(len);
//				System.out.println(new String(buf, 0, len));
				// ��Ʈ�� Ŭ������ buf �ȿ� �ִ� ������
				// ���ڿ��� �ٲپ� �ش�.		
				sb.append(new String(buf, 0, len));
				System.out.println(sb);
				// EOF�� Ű����� ���� �Է��ؾ� ����ȴ�.
				// ����Ű�� ctrl + z 
			}
			// ���ϰ��� ��Ʈ�̴�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
				// ��Ʈ�� �ݱ�, ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("===========�Էµ�����");
		System.out.println(sb);
	}

}
