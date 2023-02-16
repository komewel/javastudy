package ex03_insert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {

	/*
	 	execute 는 int값을 반환한다(ex. 1행을 삽입했습니다.)
	    개선품으로  executeUpdate가 있다 dml전용이다
	    
	    jdbc는 커밋이 autocommit이라 커밋을따로 안해줘도 자동저장된다.
	    트랜잭션은 인서트 업데이트 딜리트가 2개이상되어서 프로그램이 만들어질때 하면된다
	    
	    이렇게 이클립스에서 쿼리문을짜면 버전을 안타는 장점이있다.
	 */
	//상수 삽입
	public static void ex01() {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql= "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += " VALUES(MEMBER_SEQ.NEXTVAL, 'admin', '관리자', '서울', TO_DATE('2023-02-15', 'YYYY-MM-DD'))"; //오라클에서는 YY/MM/DD가 형식이라서 외우자 YYYY-MM-DD 처럼 나오질 않는다
			ps = con.prepareStatement(sql);
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	// 변수 삽입
	public static void ex02() {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += "VALUES(MEMBER_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";//변수 처리는 ? 이걸로 
					
			ps = con.prepareStatement(sql);		
			
			String id = "master"; // 이 아래 3개가 저위에 ?에 변수로 들어가는거
			String name = "운영자";
			String address = "경기";
			
			ps.setString(1, id); // 1번째 물음표(?) 자리에 id를 넣으시오.
			ps.setString(2, name); // 2번째 물음표(?) 자리에 name를 넣으시오.
			ps.setString(3, address); // 3번째 물음표(?) 자리에 address를 넣으시오.
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex03() {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "INSERT INTO BOARD_TBL(BOARD_NO, MEMBER_NO, TITLE, CONTENT, CREATE_DATE)";
			sql += "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 1;
			String title = "가나다라";
			String content = "마바사아";
			
			ps.setInt(1, memberNo);
			ps.setString(2, title);
			ps.setString(3, content);
			
			int insResult = ps.executeUpdate(); 
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		ex03();
	}

}
