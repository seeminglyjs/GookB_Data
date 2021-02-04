package kh.model.vo.Book;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Book implements Serializable{
	private String title;
	private int price;
	
	public Book() {
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	
	public void fileSave(String fileName){
		File file = new File(fileName);
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		Scanner scan = new Scanner(System.in);
		try {

			bos = new BufferedOutputStream(
					new FileOutputStream(file));
			//파일 출력스트림
			
			String data = scan.nextLine();
			//데이터 입력 받을 변수
			
			bos.write(data.getBytes(), 0, data.length());
			bos.flush();
			
			oos = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(file)));
			//객체 출력스트림
			
			Book b1 = new Book("자바를 정복하자", 3500);		
			oos.writeObject(b1);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	}
	
	//오버로드
	public void fileSave(){
			ArrayList<Book> list = new ArrayList<>();		
			list.add(new Book("자바를 잡아라", 30000));
			list.add(new Book("오라클 정복", 35000));
			list.add(new Book("웹표준 2.0", 27500));
			list.add(new Book("자바 Servlet/JSP", 28000));
			list.add(new Book("ajax 사용법", 15000));
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTitle() + " ");
				System.out.println(list.get(i).getPrice());
			}
	}
	
	
	
	//// getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
