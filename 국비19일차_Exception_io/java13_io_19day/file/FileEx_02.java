package java13_io_19day.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// class File의 생성자
		// File(String path, String filename)
		// 경로, 파일명
		// File(File path, String filename)
		// 경로객체, 파일명
		
		// File(String filepath) 
		// 경로 + 파일명
	
		// ./src/java13_io_19day/file/Hello.txt
		
		File f = new File("./src/java13_io_19day/file/Hello");
		System.out.println(f);
		System.out.println(f.length());
		System.out.println(f.exists());
		
		System.out.println("\n----------------------------------------");
		
		File f2 = new File("./src/java13_io_19day/file/Hello");
		// 프로젝트폴더는 ./ 으로 생략할 수 있다.
		System.out.println(f2);
		System.out.println(f2.length());
		System.out.println(f2.exists());
	}
}
