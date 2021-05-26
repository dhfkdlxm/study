package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
	아이디 입력 : hong
	수정할 이름을 입력 : 홍길순
	업데이트 : 홍길동 → 홍길순
*/

public class UpdateMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);
		try {
			// 1단계 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);

			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.println("수정할 이름을 입력 : ");
			String name = sc.nextLine();

			// 3단계
			/*
			 * String sql = "update t_test "; sql += " set name = ? "; sql +=
			 * " where id = ? ";
			 */
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ? ");
			sql.append(" where id = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, name);
			pstmt.setString(2, id);

			// 4단계
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 수정함");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}

		}

	}

}
