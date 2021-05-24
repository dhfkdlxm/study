package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		

		try {
			// 1단계 : JDBC 드라이버 로딩
			//외부 파일을 빌드패스해서 사용하는 것이기 때문에 예외발생 확인!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			// 2단계 : DB 접속 및 연결 객체 얻기~
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.119.119:1521/dink", "scott", "tiger");
			System.out.println("DB 접속 성공 : " + conn);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
