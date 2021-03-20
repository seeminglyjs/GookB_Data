package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OjdbcEx_04 {

	//OJDBC 드라이버
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	//DB 연결 정보
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME ="scott";
	private static final String PASSWORD ="tiger";
	//OJDBC 객체
	private static Connection conn = null; // DB 연결 객체
	private static Statement st = null; //SQL 수행 객체
	private static PreparedStatement ps = null; //SQL 수행 객체
	private static ResultSet rs = null; // 조회 결과 객체

	public static void main(String[] args) {
		System.out.println("Hello JDBC");

		//-------드라이버 로드-------
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------

		//------조회할 job 입력받기-------------
		Scanner sc = new Scanner(System.in);
		System.out.println("----조회할 job 입력----");
		String job = sc.nextLine();
		
		//------SQL 작성-------------
		String sql = "SELECT * FROM EMP WHERE JOB = ?"
				+ " ORDER BY EMPNO";
		//---------------------------
		//System.out.println("TEST\n" + sql);
		
		
		
			//DB 연결
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
			//-----sql 수행 객체-----
			ps = conn.prepareStatement(sql);
			
			//sql 코드의 첫번째 ?에 job변수의 값을 넣는다.
			ps.setString(1, job); // 시작값은 1부터 시작
		
			rs = ps.executeQuery();
			
			System.out.println();
			System.out.println("-----조회된 내용------");
			while(rs.next()) {	
				System.out.print(rs.getString("empno") +" ");
				System.out.print(rs.getString("ename") +" ");
				System.out.println(rs.getString("job") +" ");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}
}
