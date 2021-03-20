package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Emp;

public class Test {

	
	private static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String NAME = "scott";
	private static String PASSWORD = "tiger";
	
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	
	public static void main(String[] args) {
		

		//jdbc드라이브 블러오기
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//sql 구문 작성
		String sql = "SELECT * FROM EMP WHERE DEPTNO = ? ";
		
		
		try {
			// DB에 연결하기
			conn = DriverManager.getConnection(URL,NAME,PASSWORD);
			
			
			Scanner scan = new Scanner(System.in);
			// deptno 를 입력받는다.
			System.out.println("---- 부서 번호를 입력 - - - -");
			int deptNo = scan.nextInt();
			//준비된 sql을 state먼트로 넘긴다.
			ps = conn.prepareStatement(sql);
			//입력된 값은 deptno로 넘긴다.
			ps.setInt(1, deptNo);
			//ResultSet로 결과를 받는다.
			rs = ps.executeQuery();

			List<Emp> list = new ArrayList<>();
			while(rs.next()) {
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));	
				list.add(emp);
			}
			
			for(Emp e : list) {
				System.out.println(e);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
