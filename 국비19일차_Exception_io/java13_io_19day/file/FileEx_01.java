package java13_io_19day.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// class File
		// 파일의 정보를 관리하는 클래스
		// -> 파일입출력에서 입출력대상으로 지정할 수 있게 해준다.
		
		File file = new File("C:/Users/sexyh/OneDrive/문서/test.txt");
		
		System.out.println(file);
		// 경로 + 파일명
		System.out.println(file.length());
		System.out.println(file.exists());
	}
}
