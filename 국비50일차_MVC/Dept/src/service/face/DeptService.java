package service.face;

import java.util.List;

import dto.Dept;

public interface DeptService {

	/**
	 * 부서 정보 조회하기
	 * 주어진 부서번호를 이용하여 부서정보를 조회하고 DTO 객체로 반환
	 * @param deptno - 조회할 부서번호
	 * @return 조회된 부서정보를 저장한 객체, 없으면 null
	 */
	public Dept deptInfo(int deptno);

	
	/**
	 * 신규 부서 입력
	 * 
	 * @param newDept - 등록한 신규 부서 정보 객체
	 */
	public void register(Dept newDept);

	/**
	 * 신규 부서 번호를 입력받아 삭제
	 * 
	 * 
	 * @param deptno
	 */
	public void delete(int deptno);

	/**
	 * 부서이름을 입력받아 그에따른 부서정보 출력
	 * @param dname
	 * @return
	 */
	public List<Dept> deptDname(String dname);


	/**
	 * 지역정보를 입력받아 그에따를 부서정보 출력
	 * 
	 * @param loc
	 * @return
	 */
	public List<Dept> deptLoc(String loc);

}
