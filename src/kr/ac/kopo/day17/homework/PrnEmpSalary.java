package kr.ac.kopo.day17.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PrnEmpSalary {

	public static void main(String[] args) {
		//1단계 
		Connection conn =null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.217.57:1522:xe";
			String id = "hr";
			String pw = "hr";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT J.JOB_TITLE AS JOB_TITLE, AVG(E.SALARY) AS AVG_SAL ");
			sql.append("FROM JOBS J, EMPLOYEES E "); 
			sql.append("WHERE J.JOB_ID = E.JOB_ID AND E.SALARY >= ? ");
			sql.append("GROUP BY J.JOB_TITLE ");
			sql.append("ORDER BY AVG_SAL DESC ");
			pstmt = conn.prepareStatement(sql.toString());
			System.out.print("급여를 입력하세요!");
			String input = sc.nextLine();
			pstmt.setString(1, input);
			
			ResultSet rs = pstmt.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				String job_title = rs.getString("job_title");
				int avg_sal = rs.getInt("AVG_SAL");
				System.out.println("["+job_title+"] : " + avg_sal) ;
				cnt++;
			}
			System.out.println("총  [" + cnt + "] 명이 검색되었습니다. ");
			
	
			
			
			
			
		} catch (Exception e) {
			// 
			e.printStackTrace();
		} finally {
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
