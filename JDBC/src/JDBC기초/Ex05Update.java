package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05Update {

	public static void main(String[] args) {

		// id, pw, 수정할 점수
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원정보 수정 =====");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("수정할 점수 입력 : ");
		int nScore = sc.nextInt();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "er562312@!";
			
			conn = DriverManager.getConnection(url, user, password);
			
			if (conn != null) {
				System.out.println("DB 연결 성공");
			} else {
				System.out.println("DB 연결 실패");
			}
			
			String sql = ("update jdbctest.bigdatamember set score = ? where id = ? AND pw = ?");
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, nScore);
			
			psmt.setString(2, id);
			
			psmt.setString(3, pw);
			
			// 4. sql문 실행
			int row = psmt.executeUpdate();
			
			// 5. 결과를 이용한 작업처리
			if(row > 0) {
				System.out.println("회원 정보 수정 성공");
			} else {
				System.out.println("회원 정보 수정 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(conn != null)
				conn.close();
			if(psmt != null)
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
