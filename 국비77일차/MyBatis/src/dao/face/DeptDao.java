package dao.face;

import java.util.List;

import dto.Dept;

public interface DeptDao {

	/**
	 * 부서번호를 이용하여 특정 부서정보를 조회한다.
	 * 
	 * @param deptno
	 * @return
	 */
	public Dept selectByDeptno(int deptno);

	/**
	 * 부서전체를 조회하는 메소드
	 * 
	 * @return 조회된 전체 부서의 정보 목록
	 */
	public List<Dept> selectAll();

	/**
	 * 부서명을 이용한 부서정보 조회하기
	 * 
	 * @param str
	 * @return
	 */
	public Dept selectByDname(String dname);

	/**
	 * 부서명(DTO에 저장된)을 이용한 부서정보 조회하기
	 * 
	 * @param data dept 객체(조회할 부서이름을 포함)
	 * @return
	 */
	public Dept selectByDeptDname(Dept data);

	/**
	 * 새로운 부서정보를 입력하는 메소드
	 * 
	 * @param input
	 */
	public void insert(Dept input);
}
