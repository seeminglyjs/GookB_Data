package java13_io_19day.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// class File�� ������
		// File(String path, String filename)
		// ���, ���ϸ�
		// File(File path, String filename)
		// ��ΰ�ü, ���ϸ�
		
		// File(String filepath) 
		// ��� + ���ϸ�
	
		// ./src/java13_io_19day/file/Hello.txt
		
		File f = new File("./src/java13_io_19day/file/Hello");
		System.out.println(f);
		System.out.println(f.length());
		System.out.println(f.exists());
		
		System.out.println("\n----------------------------------------");
		
		File f2 = new File("./src/java13_io_19day/file/Hello");
		// ������Ʈ������ ./ ���� ������ �� �ִ�.
		System.out.println(f2);
		System.out.println(f2.length());
		System.out.println(f2.exists());
	}
}
