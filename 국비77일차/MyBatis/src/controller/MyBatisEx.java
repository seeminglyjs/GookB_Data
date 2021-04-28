package controller;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import dao.face.DeptDao;
import dto.Dept;
import mybatis.MyBatisConnectionFactory;

public class MyBatisEx {

	public static void main(String[] args) {
		
		//마이바티스 실행 객체
		SqlSession sqlSession;
		
		//db 접속 및 sql 수행 객체 생성하기
		sqlSession = MyBatisConnectionFactory
					.getSqlSessionFactory()
					.openSession(true);//매개변수가 true일경우 auto commit

		
		//-------------------------------------------
	
		//마이바티스의 매퍼와 자바프로그램의 DAO 인터페이스가 메핑된다(연결됨)
		DeptDao deptDao = sqlSession.getMapper(DeptDao.class);
		System.out.println("mybatis load success");
	
		//마이바티스를 이용한 SQL 수행
		Dept dept = deptDao.selectByDeptno(20);
		System.out.println(dept);
	
		//-------------------------------------------
		
		//전체 부서 조회
		List<Dept> list = deptDao.selectAll();
		System.out.println();
		System.out.println("----------------------");
		for(Dept d : list) {
			System.out.println(d);
		}
			
		//-------------------------------------------
		
		String str = "ACCOUNTING";
		Dept reuslt = deptDao.selectByDname(str);
		System.out.println();
		System.out.println("부서명을 이용한 조회");
		System.out.println(reuslt);
		
		//-------------------------------------------
		Dept data = new Dept();
		data.setDname("OPERATIONS");
		// mapper에는 DTO 멤버 필드명 그대로 적어주면 된다
		Dept result2 = deptDao.selectByDeptDname(data);
		System.out.println("부서명을 이용한 조회");
		System.out.println(result2);
	
		//-------------------------------------------
		System.out.println();
		System.out.println("새로운 부서 정보 삽입");
		Dept input = new Dept();
		
		Scanner sc = new Scanner(System.in);
		input.setDeptno(sc.nextInt());
		sc.nextLine();
		input.setDname(sc.nextLine());
		input.setLoc(sc.nextLine());
	
		deptDao.insert(input);
		
//		System.out.println("삽입 데이터 확인");
//		for(Dept d : deptDao.selectAll()) {
//			System.out.println(d);
//		}
		
		System.out.println("삽입 데이터 확인");
		System.out.println(deptDao.selectByDeptno(input.getDeptno()));
		
		
	}

}
