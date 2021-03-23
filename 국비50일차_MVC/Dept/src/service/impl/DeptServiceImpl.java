package service.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import common.JDBCTemplate;
import dao.face.DeptDao;
import dao.impl.DeptDaoImpl;
import dto.Dept;
import service.face.DeptService;

public class DeptServiceImpl implements DeptService{

	//DAO 객체
	private DeptDao deptDao = new DeptDaoImpl();

	@Override
	public Dept deptInfo(int deptno) {

		//Connection 객체
		Connection conn = JDBCTemplate.getConnection();

		//부서정보 조회
		Dept info = deptDao.selectByDeptno(conn,deptno);

		//조회된 부서정보 반환
		return info;
	}


	@Override
	public void register(Dept newDept) {
		//Connection 객체
		Connection conn = JDBCTemplate.getConnection();

		// 신규 부서 정보 삽입
		int res = deptDao.insertDept(conn,newDept);


		if(res == 1) {
			System.out.println("데이터가 정상적으로 삽입되었습니다.");
			JDBCTemplate.commit(conn);//커밋
		}else {
			System.out.println("데이터가 비정상적입니다. Rollbakc수행");
			JDBCTemplate.rollback(conn); // 롤백

		}
	}
	
	@Override
	public void delete(int deptno) {
		//Connection 객체
		Connection conn = JDBCTemplate.getConnection();
		
		int res = deptDao.deleteDept(conn, deptno);
		
		if(res == 1) {
			System.out.println(deptno + " 부서의 정보가 정상적으로 삭제됨");
			JDBCTemplate.commit(conn);
		}else {
			System.out.println(deptno + " 부서의 정보가 정상적으로 삭제안됨 -rollback-");
			JDBCTemplate.rollback(conn);
		}
	}
	
	@Override //부서이름을 입력받아 list 객체로 리턴
	public List<Dept> deptDname(String dname) {
		Connection conn = JDBCTemplate.getConnection();
		List<Dept> list = new ArrayList<>();
	
		list = deptDao.selectByDname(conn, dname);
		
		return list;
	}
	
	@Override
	public List<Dept> deptLoc(String loc) {
		Connection conn = JDBCTemplate.getConnection();
		List<Dept> list = new ArrayList<>();
		
		list = deptDao.selectByLoc(conn, loc);
		
		
		return list;
	}
	
	
}
