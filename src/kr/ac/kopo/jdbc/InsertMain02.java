package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
	JDBC 작업 순서
	1. 드라이버 로딩
	2. db접속 후 연결객체 얻기
	3. sql문 실행할 객체 얻기
	4. sql문 실행 및 결과 얻기
	5. db 접속 해제
*/

public class InsertMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1단계 : 드라이버 로딩 성공
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...!");
			
			//2단계 : DB 연결 후 Connection 객체를 얻기
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conncection 성공  : " + conn);
			
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();
			
			
			//3단계 : SQL 실행 객체 얻기
			stmt = conn.createStatement();
			String sql = "insert into t_test(id,name) ";
			       sql += " values(\'"+id+"\', \'"+name+"\') "; //세미콜론 붙이지 않음!
			       
			//4단계 : SQL 문 실행 및 결과 얻기 
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt +"개 행 삽입");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}

	}

}
