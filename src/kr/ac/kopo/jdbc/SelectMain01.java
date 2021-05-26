package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

	public static void main(String[] args) {

	
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1단계 : 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 : 접속
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url, user, password);
			
			//3단계
			String sql = "select * from t_test";
			pstmt = conn.prepareStatement(sql);
			
			//4단계
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + "  || name : " + name);
			}			
		} catch (Exception e) {

		} finally {
			//5단계
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}

}
