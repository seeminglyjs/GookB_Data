package java13_io_19day;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		// in - > 키보드 표준 입력 스트립 객체
		
		byte [] buf = new byte[10]; 
		// read의 매개 변수
		int len = -1; // 입력받은 데이터의 길이
		// read 메소드의 반환값으로 -1 EOF를
		// 나타내는 특별한 값으로 지정
		
		StringBuilder sb = new StringBuilder();
		// 입력 데이터 전체 저장 용도
		
		System.out.println("========== 입력대기중");
		try {
			while((len = is.read(buf)) != -1) {
//				System.out.println(len);
//				System.out.println(new String(buf, 0, len));
				// 스트링 클래스가 buf 안에 있는 내용을
				// 문자열로 바꾸어 준다.		
				sb.append(new String(buf, 0, len));
				System.out.println(sb);
				// EOF를 키보드로 직접 입력해야 종료된다.
				// 단축키는 ctrl + z 
			}
			// 리턴값이 인트이다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
				// 스트림 닫기, 헤제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("===========입력데이터");
		System.out.println(sb);
	}

}
