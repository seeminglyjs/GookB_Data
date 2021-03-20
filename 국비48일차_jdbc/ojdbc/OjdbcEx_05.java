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

public class OjdbcEx_05 {

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

		
		//------ 조회 결과 저장 리스트
		List<Emp> list = new ArrayList<>();
		
		
		try {
			//db 연결
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
			//-----sql 수행 객체-----
			ps = conn.prepareStatement(sql);
			ps.setString(1, job);
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
			
			//----최종 결과 출력 -----
			
			for(Emp e : list) {
				System.out.println(e);
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
