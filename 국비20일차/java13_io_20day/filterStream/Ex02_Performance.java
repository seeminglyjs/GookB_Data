package java13_io_20day.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		//���� ��, Performance Evaluation
		//	�˰��� ���� �� ����ð� üũ - start
		//	�˰��� �Ϸ� �� ����ð� üũ - end
		//	���� ���̸� ���Ѵ�, ����ð� : end - start
		
		long start = System.currentTimeMillis(); //����ð� �и���
		// start, end ���̿� ���Ϸ��� �˰����� �ۼ��Ѵ�
		long end = System.currentTimeMillis(); //����ð� �и���
		
		System.out.println( end-start );
		System.out.println( (end-start)/(double)1000 );
		
		System.out.println("----------------------------");
		
		//�Է´�� ���� ��ü
		File file = new File("./src/java13_io_20day/filterStream/source.txt");
		System.out.println("[TEST] file : " + file.exists());

		//���� �Է� ��Ʈ�� ��ü
		FileInputStream fis = null; //1����Ʈ��
		BufferedInputStream bis = null; //2����Ʈ��, ���� ��� ������Ʈ��
	
		//���� �Է°��� ���� ����
		byte[] buf = new byte[1024]; //�Է� ������ ����
		int len = 0; //�Է� �������� ����
		
		
		try {
			//���� �Է� ��Ʈ�� ����
			fis = new FileInputStream(file); //File -> FileInputStream
			
			//���� �Է�
			start = System.currentTimeMillis();
			while( (len = fis.read(buf)) != -1 ) {
			}
			end = System.currentTimeMillis();
			System.out.println("fis ��� : " + (end-start)/(double)1000 );
			
			
			System.out.println("----------------");
			
			
			//���� �Է� ��Ʈ�� ����
			fis = new FileInputStream(file); //File -> FileInputStream
			bis = new BufferedInputStream(fis); // FileInputStream -> BufferedInputStream
			
			//���� �Է�
			start = System.currentTimeMillis();
			while( (len = bis.read(buf)) != -1 ) {
			}
			end = System.currentTimeMillis();
			System.out.println("bis ��� : " + (end-start)/(double)1000 );
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}















