package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.face.UserDao;
import dto.User;

public class UserDaoImpl implements UserDao {
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
//--------------------------------------------------------------------
	//생성자
	public UserDaoImpl() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//--------------------------------------------------------------------
	@Override // 테이블 전체 조회
	public List<User> selectAll() {
		String sql = "SELECT * FROM userTest"
				+ " ORDER BY IDX";
		List<User> list = new ArrayList<>();

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()) {
				User user  = new User();
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));

				list.add(user);
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
//--------------------------------------------------------------------
	@Override // 테이블 데이터 삽입
	public void insertUser(User insertUser) {
		String sql = "INSERT INTO userTest( idx, userid, name ) "
				+ "VALUES (userTest_SQ.nextval, ?, ?)";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, insertUser.getUserid());
			ps.setString(2, insertUser.getName());
			ps.executeUpdate();

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
//--------------------------------------------------------------------

	@Override // idx로 유저 검색
	public User selectByIdx(int i) {
		String sql = "SELECT * FROM userTest WHERE IDX = ?";
		User user = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, i);
			rs = ps.executeQuery();

			while(rs.next()) {
				user  = new User();
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));
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
		return user;
	}
//--------------------------------------------------------------------	

	@Override
	public void deleteByIdx(int i) {
		String sql = "DELETE FROM USERTEST WHERE IDX = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, i);
			ps.executeUpdate();

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

}
