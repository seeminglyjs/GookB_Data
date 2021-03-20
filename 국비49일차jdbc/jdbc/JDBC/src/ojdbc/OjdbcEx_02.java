package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_02 {

	//OJDBC 드라이버
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	//DB 연결 정보
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME ="scott";
	private static final String PASSWORD ="tiger";
	//OJDBC 객체
	private static Connection conn = null; // DB 연결 객체
	private static Statement st = null; //SQL 수행 객체
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

		//------SQL 작성-------------
		String sql1 = "";
		sql1 +="CREATE TABLE USERTEST(";
		sql1 +=" IDX NUMBER CONSTRAINT PK_USER_TEST PRIMARY KEY";
		sql1 +=" ,NAME VARCHAR2(50) NOT NULL";
		sql1 +=" ,PHONE VARCHAR2(50) NOT NULL";
		sql1 +=" )";

		String sql2 = "";
		sql2 += "CREATE SEQUENCE SEQ_USERTEST";
		sql2 += " INCREMENT BY 1";
		sql2 += " START WITH 1";
		//---------------------------

		try {
			//DB 연결
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//-------------------------------------------------
			//SQL 수행
			st = conn.createStatement(); // Statement 객체 얻기

			st.execute(sql1);// 테이블 생성쿼리 수행
			st.execute(sql2);// 시퀀스 생성쿼리 수행
			
			//------테이블 생성 확인 --------
			String sql = "SELECT COUNT(*) CNT_TB FROM TABS "
					+ "WHERE TABLE_NAME = 'USERTEST'"; 
			
			//select 쿼리 수행 및 결과 저장
			rs = st.executeQuery(sql);
			// 조회된 첫번째 행을 참조하도록 만듬
			rs.next();
			//조회결과를 RsultSet의 컬럼명이 cnt_tb인 값 얻어오기
			int tb_cnt = rs.getInt("CNT_TB");
			//조회 결과를 이용한 출력
			if(tb_cnt> 0) {
				System.out.println("테이블 생성 완료");
			}else {
				System.out.println("테이블 생성 실패");
			}
			//---------------------------------
			
			
			//------시퀀스 생성 확인 --------------
			sql = "SELECT COUNT(*) CNT_SEQ\r\n" + 
					"FROM USER_SEQUENCES\r\n" + 
					"WHERE SEQUENCE_NAME = 'SEQ_USERTEST'";
			//sql 수행결과 저장
			rs = st.executeQuery(sql);
			
			//조회결과 첫번째 행 참조
			rs.next();
			
			// 조회결과 중에서 첫번째 컬럼의 값을 int형으롤 반환
			int seq_cnt = rs.getInt(1);
			//** String으로 컬럼명을 전달인자로 사용할 수 있음
			//** int 형으로 column_id(컬럼순서)를 전달인자로 사용할 수 있음
			
			
			if(seq_cnt > 0) {
				System.out.println("시퀀스 생성 완료");
			}else {
				System.out.println("시퀀스 생성 실패");
			}
			//--------------------------------	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(st!=null) st.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}


	}
}
