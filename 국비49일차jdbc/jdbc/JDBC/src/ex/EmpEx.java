package ex;

import java.util.List;
import java.util.Scanner;

import dao.face.EmpDao;
import dao.impl.EmpDaoImpl;
import dto.Emp;

//실행클래스
public class EmpEx {

	//EmpDao 객체 생성 - DB연결
	private static EmpDao empDao = new EmpDaoImpl();

	public static void main(String[] args) {
		//DAO 객체를 이용해 Emp테이블 전체조회	
		List<Emp> list = empDao.selectAll();

		for(Emp e : list) {
			System.out.println(e);
		}

		System.out.println("-----------------");	
		// 부서번호를 입력받아 조회하기	
		Scanner sc = new Scanner(System.in);
		
		//부서번호 입력
		System.out.println("조회할 부서 번호를 입력하세요......");
		int deptno = sc.nextInt();
		
		//부서번호를 이용한 db 데이터 조회
		List<Emp> resList = empDao.selectByDeptno(deptno);
		
		for(Emp e : resList) {
			System.out.println(e);
		}
		
		//--------------------------------------------------------------
		System.out.println("-----------------");
		//사원번호, 사원이름, 부서번호 입력받아서 처리하기
		// -> INSERT 하기
		Emp insertEmp = new Emp();
		
		System.out.println("---- 사원 번호 ----");
		insertEmp.setEmpno(sc.nextInt());
		sc.nextLine(); // 버퍼 비우기
		
		System.out.println("---- 사원이름 ----");
		insertEmp.setEname(sc.nextLine());
		
		System.out.println("---- 부서 번호 ----");
		insertEmp.setDeptno(sc.nextInt());
		
		//입력된 정보 확인
//		System.out.println(insertEmp);
		
		
		//DAO를 이용한 DB데이터 삽입
		empDao.insert(insertEmp);
		
		
		//--------------------------------------------------------------
		System.out.println("-----------------");
	
		//삽입된 사원정보 조회해서 확인
		Emp resEmp = empDao.seletByEmpno(insertEmp.getEmpno());
		System.out.println("<<DB에 추가된 사원>>");
		
		if(resEmp ==null) {
			System.out.println("사원정보 삽입 실패");
		}else {
			System.out.println("사원정보 삽입 성공");
			System.out.println(resEmp);
		}
		
	
	
	
	
	
	
	
	
	}

}

