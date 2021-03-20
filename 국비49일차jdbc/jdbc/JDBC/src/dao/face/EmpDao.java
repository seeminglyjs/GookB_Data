package dao.face;

import java.util.List;

import dto.Emp;

public interface EmpDao {
	
	//테이블 전체조회
	public List<Emp> selectAll();
	
	//지정된 부서번호의 사원들 조회
	public List<Emp> selectByDeptno(int deptno);

	//새로운 사원정보 삽입
	public void insert(Emp insertEmp);
	
	/**
	 * 사원번호로 사원 정보 조회
	 * @param empno 조회하려는 사원번호
	 * @return 사원번호로 조회한 사원의 정보 DTO객체, 조회결과 없으면 null
	 */
	public Emp seletByEmpno(int empno);



	

}
