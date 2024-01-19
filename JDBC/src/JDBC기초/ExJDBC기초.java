package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExJDBC기초 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("id 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB연결 통로 열기(url, user, password)
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "er562312@!";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("DB 연결 성공");
			} else {
				System.out.println("DB 연결 실패");
			}

			// 3. sql문 준비
			// 로그인 기능 >> 테이블에 일치하는 데이터가 있는지 확인 >> select
			// 아이디, 비밀번호 일치하는 데이터의 모든 컬럼 가져오기!
			String sql = "select * from jdbctest.bigdatamember where ID = ? and PW = ? ";

			psmt = conn.prepareStatement(sql);
			// ? 인자 채워주기
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 4. sql문 실행
			rs = psmt.executeQuery();
			// ResultSet이란?
			// : 조회된 데이터를 테이블과 같은 형태로 표현해주는 집합 자료구조!
			// : cursor 를 가지고 있다. (처음에는 column을 가리키고 있음)
			// : cursor 가 가리키고 있는 데이터만 가져올 수 있다.
			// rs.next() ==> cursor 하나를 내리는 작업

			if (rs.next() == true) {
				// 로그인에 성공
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				System.out.println(name + "(" + age + ")님 환영합니다.");
			} else {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("아이디와 비밀번호를 확인해주세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
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
