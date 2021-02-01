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
			// ./ -> ���� ���α׷��� ����� ����
			//    -> ������Ʈ ���� (main())
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
		// �ý��� �����׸�
		System.out.println(sysPro.getProperty("java.version"));
		// �ڹٹ���
		System.out.println(sysPro.getProperty("os.name"));
		// OS �̸�
		System.out.println(sysPro);
		
		

	}

}
