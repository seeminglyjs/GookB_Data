package ex;

import java.util.List;
import java.util.Scanner;

import dao.face.UserDao;
import dao.impl.UserDaoImpl;
import dto.User;

public class UserEx {
	
	// DAO 생성
	private static UserDao userDao = null; // 동작되도록 바꾸세요!!

	public static void main(String[] args) {
		
		userDao = new UserDaoImpl();
		//--- 전체 출력 ---
		List<User> list = userDao.selectAll();
		for(User u : list) {
			System.out.println(u);
		}
		//-----------------

		//--- 유저 삽입 ---
		// 유저 객체를 생성하고
		// 유저 정보를 객체에 입력하고
		//DB에 삽입되도록 구현하세요!!
		
		//	userId : A123
		//	name : Alice
		Scanner scan = new Scanner(System.in);
		User insertUser = new User();
		System.out.println("유저 ID 입력");
		insertUser.setUserid(scan.nextLine());
		System.out.println("유저 이름 입력");
		insertUser.setName(scan.nextLine());	
		userDao.insertUser(insertUser);
		//-----------------
//		
//		
//		
		//--- 유저 조회 ---
		User selectUser = userDao.selectByIdx(20);
		System.out.println(selectUser);
		//-----------------		
		
//		
//		
//		
//		//--- 유저 삭제 ---
		System.out.println("삭제할 데이터 입력");
		int delNum = scan.nextInt();
		userDao.deleteByIdx(delNum);
//				
		// 유저 조회 - 삭제됐는지 확인하는 용도(null나와야함)
		User resultUser = userDao.selectByIdx(20);
		System.out.println(resultUser);
		//-----------------
		
	}
	
}
