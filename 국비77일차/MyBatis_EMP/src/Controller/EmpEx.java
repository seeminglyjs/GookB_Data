package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import dao.face.EmpDao;
import dto.Emp;
import mybatis.MyBatisConnectionFactory;

public class EmpEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SqlSession sqlSession;
		
		sqlSession = MyBatisConnectionFactory
					.getSqlSessionFactory()
					.openSession(true); // 매개변수 없으면 기본이 false 이다.

		//마이바티스 SqlSession클래스의 주요 메소드

//		sqlSession.commit();
//		sqlSession.rollback();
		
		//DB에 select코드를 수행하는 메소드
//		sqlSession.select(SQL, Argument[ResultSet]);
//		sqlSession.select("SELECT * FROM EMP ORDER BY EMPNO", ResultHander);		

		//DB에서 단일해 select코드를 수행하고 1개의 DTO로 반환하는 메소드
//		sqlSession.selectOne(SQL, Argument); // 한행만 조회 할 떄

		//DB에서 다중행 select코드를 수행하고 List<DTO>로 반환하는 메소드
//		sqlSession.selectList(SQL, Argument)

		//DB에서 조회된 select결과를 Map으로 반환하는 메소드
//		sqlSession.selectMap(SQL, Argument)

		//DB에서 INSERT, UPDATE, DELETE를 수행하는 메소드
//		sqlSession.insert(SQL, Argument);
//		sqlSession.update(SQL, Argument);
//		sqlSession.delete(SQL, Argument);
		
		//Dao 인터페이스의 추상메소드와 Mapper XML의 SQL 태그를 매핑하는 메소드
		EmpDao empDao = sqlSession.getMapper(EmpDao.class);
		//---------------------------------------------------------
		
		
		
		//전체 조회 메소드
		List<Emp> list = empDao.selectAll();
		for(Emp e : list) {
			System.out.println(e);
		}
		
		
		Emp temp = new Emp();	
		System.out.println("찾을 유저 번호 입력 ------->");
		temp.setEmpno(scan.nextInt());
		scan.nextLine();
		// 유저 번호를 입력받아 해당 유저 정보를 가져오는 메소드
		Emp emp = empDao.selectByEmpNo(temp);
		System.out.println();
		System.out.println(emp);
		
		
		temp = new Emp();	
		System.out.println("삭제할 유저 번호 입력 ------->");
		temp.setEmpno(scan.nextInt());
		scan.nextLine();
		// 유저 번호를 입력받아 해당 유저 정보를 삭제하는 메소드
		empDao.deleteByEmpNo(temp);
		System.out.println();
		
		Date date = new Date();	
		emp = new Emp();
		emp.setEmpno(scan.nextInt());
		scan.nextLine();
		emp.setEname(scan.nextLine());
		emp.setJob(scan.nextLine());
		emp.setMgr(scan.nextInt());
		scan.nextLine();		
		//날짜 처리
		// String -> java.util.Date(반환 필요)
		// SimpleDateFormat 클래스 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String data ="1849-05-21";// 입력된 날짜
		Date hireDate = null;
		try {
			hireDate = sdf.parse(data);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		emp.setHiredate(hireDate);
		emp.setSal(scan.nextDouble());
		scan.nextLine();
		emp.setComm(scan.nextDouble());
		scan.nextLine();
		emp.setDeptno(scan.nextInt());
		scan.nextLine();
		//유저 정보를 삽입하는 메소드
		empDao.insertEmp(emp);
		
		System.out.println("삽입된 유저 번호 입력 ------->");	
		// 유저 번호를 입력받아 해당 유저 정보를 가져오는 메소드
		temp = empDao.selectByEmpNo(emp);
		System.out.println();
		System.out.println(temp);
		
		//----------------------------------------------------
		 
	}

}
