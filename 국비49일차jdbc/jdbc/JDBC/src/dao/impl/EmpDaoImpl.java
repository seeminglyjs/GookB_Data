package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.face.EmpDao;
import dto.Emp;

public class EmpDaoImpl implements EmpDao{

	//OJDBC 드라이버
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	//DB 연결 정보
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME ="scott";
	private static final String PASSWORD ="tiger";
	//OJDBC 객체
	private static Connection conn = null; // DB 연결 객체
	private static PreparedStatement ps = null; //SQL 수행 객체
	private static ResultSet rs = null; // 조회 결과 객체

	public EmpDaoImpl() {
		try {
			Class.forName(DRIVER);
			//----db 연결		
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	//--------------------------------------------------------------------
	@Override
	public List<Emp> selectAll() {

		//--------sql 작성
		String sql ="SELECT * FROM EMP"
				+ " ORDER BY EMPNO";
		//------------------
		//--조회 결과를 저장할 LIST
		List<Emp> list = new ArrayList<>();
		try {
			//------SQL 수행 객체 생성
			ps =conn.prepareStatement(sql);
			//-----------------------

			//--SQL 수행 및 결과 저장--------
			rs = ps.executeQuery();
			System.out.println();
			System.out.println("-----조회된 내용------");
			while(rs.next()) {	
				//각 행의 데이터를 저장할 Emp객체 생성
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				//조회결과를 담고있는 Eemp 객체를 리스트에 추가하기
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		//- 최종 조회 결과 반환
		return list;
		//-----------------------
	}

	//--------------------------------------------------------------------
	@Override
	public List<Emp> selectByDeptno(int deptno) {
		List<Emp> list = new ArrayList<>();
		String sql = "SELECT * FROM EMP WHERE DEPTNO = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, deptno);
			rs= ps.executeQuery();
			while(rs.next()) {	
				//각 행의 데이터를 저장할 Emp객체 생성
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				//조회결과를 담고있는 Eemp 객체를 리스트에 추가하기
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	//-----------------------------------------------------------------
	@Override
	public void insert(Emp insertEmp) {
		//--------sql 작성
		String sql ="INSERT INTO EMP(EMPNO, ENAME, DEPTNO) "
				+ "VALUES(?, ?, ?)";
		//------------------
		try {
			//------SQL 수행 객체 생성
			ps =conn.prepareStatement(sql);
			//-----------------------

			ps.setInt(1, insertEmp.getEmpno());
			ps.setString(2, insertEmp.getEname());//''작은따옴표는 자동처리됨
			ps.setInt(3, insertEmp.getDeptno());

			//--SQL 수행--------
			ps.executeUpdate();
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//-----------------------------------------------------------------
	@Override
	public Emp seletByEmpno(int empno) {

		//--------sql 작성
		String sql ="SELECT * FROM EMP WHERE EMPNO = ?";
		//------------------
		//--조회 결과를 저장할 emp
		Emp emp = null;
		

		try {
			//------SQL 수행 객체 생성
			ps =conn.prepareStatement(sql);
			//-----------------------

			// -- SQL의 ? 채우기
			ps.setInt(1, empno);

			//--SQL 수행 및 결과 저장--------
			rs = ps.executeQuery();
			System.out.println();
			System.out.println("-----조회된 내용------");
			while(rs.next()) {
				emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		//- 최종 조회 결과 반환
		return emp;
		//-----------------------
	}

}
