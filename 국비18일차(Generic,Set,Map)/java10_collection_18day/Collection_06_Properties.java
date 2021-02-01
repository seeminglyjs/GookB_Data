package java10_collection_18day;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_06_Properties {

	public static void main(String[] args) {

		Properties prop = new Properties();

		FileReader reader;
		try {
			reader = new FileReader("./src/java10_collection_18day/uesr.properites");
			// ./ -> 현재 프로그램이 실행된 폴더
			//    -> 프로젝트 폴더 (main())
			prop.load(reader);
			System.out.println(prop);
			
			String user = prop.getProperty("username");
			System.out.println(user);
			
			prop.setProperty("username", "bbb");
		
			FileWriter writer = new FileWriter("./src/java10_collection_18day/uesr.properites");
			prop.store(writer, "hi=hello");
			System.out.println(prop);
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n---------------------------------");
		
		Properties sysPro = System.getProperties();
		// 시스템 설정항목
		System.out.println(sysPro.getProperty("java.version"));
		// 자바버전
		System.out.println(sysPro.getProperty("os.name"));
		// OS 이름
		System.out.println(sysPro);
		
		

	}

}
