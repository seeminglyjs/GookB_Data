package java13_io_19day.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// class File
		// ������ ������ �����ϴ� Ŭ����
		// -> ��������¿��� ����´������ ������ �� �ְ� ���ش�.
		
		File file = new File("C:/Users/sexyh/OneDrive/����/test.txt");
		
		System.out.println(file);
		// ��� + ���ϸ�
		System.out.println(file.length());
		System.out.println(file.exists());
	}
}
