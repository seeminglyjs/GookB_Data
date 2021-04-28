package dao.face;

import java.util.List;

import dto.Emp;

public interface EmpDao {

	/**
	 * 전체 직원정보를 출력하는 메소드
	 * 
	 * 
	 * @return
	 */
	public List<Emp> selectAll();

	
	/**
	 * 새로운 직원정보를 삽입하는 메소드
	 * @param emp 
	 * 
	 * 
	 */
	public void insertEmp(Emp emp);

	/**
	 * 유저 번호를 입력 받아 유저 정보를 출력한다.
	 * 
	 * @param temp
	 * @return
	 */
	public Emp selectByEmpNo(Emp temp);

	/**
	 * 유저 번호를 입력 받아 해당 유저를 삭제한다.
	 * 
	 * @param temp
	 * @return
	 */
	public void deleteByEmpNo(Emp temp);
	
}
