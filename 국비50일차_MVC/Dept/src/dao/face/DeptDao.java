package dao.face;

import java.sql.Connection;
import java.util.List;

import dto.Dept;

public interface DeptDao {

	
	/**
	 * 주어진 부서번호를 이용해 해당 부서의 정보를 조회한다
	 * 
	 * @param conn - db연결 객체
	 * @param deptno - 조회할 부서번호
	 * @return 조회된 부서정보 DTO 객체, 없으면 null
	 */
	public Dept selectByDeptno(Connection conn, int deptno);

	
	/**
	 * 전달받은 객체를 이용하여 부서정보를 삽입한다
	 * 
	 * 
	 * @param conn - db 연결 객체
	 * @param newDept - 삽입한 부서 정보 객체
	 * @return : 영향받은 행의 수를 리턴 성공시 1 실패시 0
	 */
	public int insertDept(Connection conn, Dept newDept);

	
	/**
	 * 전달받은 부서번호를 통해 해당 부서를 제거한다
	 * @param conn 연결객체
	 * @param deptno 부서번호 객체
	 * @return
	 */	
	public int deleteDept(Connection conn, int deptno);


	/**
	 * 전달받은 dname로 모든 데이터 추출
	 * @param conn
	 * @param dname
	 * @return
	 */
	public List<Dept> selectByDname(Connection conn, String dname);


	/**
	 * 지역정보입력받아 select 문을 통해서 부서정보를가져옴
	 * 
	 * @param conn
	 * @param loc
	 * @return
	 */
	public List<Dept> selectByLoc(Connection conn, String loc);

}
