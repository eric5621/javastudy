package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04SelectAll {

	public static void main(String[] args) {
		// =======전체 회원 조회=======
		// ID 이름 나이 점수
		// smhrd1 스마트 20 100
		// smhrd2 스마트2 21 80
		// smhrd3 스마트3 22 95

		Scanner sc = new Scanner(System.in);

		System.out.println("=======전체 회원 조회=======");
		System.out.println("ID \t이름 \t나이 \t점수");

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "er562312@!";

			conn = DriverManager.getConnection(url, user, password);

//			if (conn != null) {
//				System.out.println("DB 연결 성공");
//			} else {
//				System.out.println("DB 연결 실패");
//			}

			String sql = ("select * from jdbctest.bigdatamember");

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getString("ID") + "\t" + rs.getString("B_NAME") + "\t" + rs.getInt("AGE")
					+ "\t" + rs.getInt("SCORE"));
				}
			} else {
				System.out.println("회원 조회 실패!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
