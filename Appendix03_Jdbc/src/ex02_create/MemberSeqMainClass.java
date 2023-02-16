package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MemberSeqMainClass {

	public static void main(String[] args) {

		Connection con = null;                        //예외처리 할려고 try문 밖에 두는것
		PreparedStatement ps = null;
		try {
			
			Class.forName("oracle.jdbc.OracleDriver"); //클래스 이름으로 실행
			
			Properties p = new Properties();		//프로퍼티 형식의 파일 읽기
			p.load(new BufferedReader(new FileReader("db.properties"))); //프로퍼티 클래스 안에 load기능 이용
			String url = p.getProperty("url");			//프로퍼티 형식의 파일 읽어올 정보 고르기
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			con = DriverManager.getConnection(url, user, password);	//읽어온 데이터를 이용해 sql 접속
			
			String sql = "CREATE SEQUENCE MEMBER_SEQ NOCACHE"; //시퀸스 생성을 위한 쿼리문 작성
			
			
			ps = con.prepareStatement(sql);  
			ps.execute();
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

}
