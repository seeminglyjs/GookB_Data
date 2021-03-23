package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JDBCTemplate;
import dao.face.DeptDao;
import dto.Dept;

public class DeptDaoImpl implements DeptDao{

	@Override
	public Dept selectByDeptno(Connection conn, int deptno) {
		PreparedStatement ps = null; //sql 수행 객체
		ResultSet rs = null; // sql 조회결과 객체

		//sql 작성
		String sql = "SELECT * FROM DEPT WHERE DEPTNO = ?";

		//쿼리 수행 결과 저장 객체
		Dept dept = null;
		try {
			ps = conn.prepareStatement(sql);	
			ps.setInt(1, deptno);

			rs = ps.executeQuery();

			while(rs.next()) {
				dept = new Dept();	
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}	
		//조회결과 반환
		return dept;
	}


	@Override
	public int insertDept(Connection conn, Dept newDept) {
		String sql = "INSERT INTO DEPT(DEPTNO, DNAME, LOC) VALUES(?, ?, ?)";
		PreparedStatement ps = null;

		// 영향 받은 행의 수
		int res = 0;

		try {
			//sql 수행 객체 처리
			ps = conn.prepareStatement(sql);
			ps.setInt(1, newDept.getDeptno());
			ps.setString(2, newDept.getDname());
			ps.setString(3, newDept.getLoc());

			//sql 수행
			res = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//자원 해제
			JDBCTemplate.close(ps);
		}
		return res;
	}

	@Override // 부서 번호에 따른 삭제 메소드
	public int deleteDept(Connection conn, int deptno) {
		String sql = "DELETE FROM DEPT WHERE DEPTNO = ?";
		PreparedStatement ps = null;
		int res = 0; // 삭제 확인을 위한 변수
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, deptno);
			res = ps.executeUpdate(); // 정상삭제시 1 리턴
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(ps);
		}
		return res;
	}
	
	@Override
	public List<Dept> selectByDname(Connection conn, String dname) {
		List<Dept> list = new ArrayList<>();
		Dept dept = null;
		String sql = "SELECT * FROM DEPT WHERE DNAME= ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dname);
			rs = ps.executeQuery();
			while(rs.next()) {
				dept = new Dept();
				
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				
				list.add(dept);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}
		return list;
	}
	
	
	@Override
	public List<Dept> selectByLoc(Connection conn, String loc) {
		List<Dept> list = new ArrayList<>();
		Dept dept = null;
		String sql = "SELECT * FROM DEPT WHERE LOC= ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, loc);
			rs = ps.executeQuery();
			while(rs.next()) {
				dept = new Dept();
				
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				
				list.add(dept);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}
		return list;
	}
	
	
}
