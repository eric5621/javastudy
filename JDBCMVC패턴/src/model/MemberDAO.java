package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	public static void main(String[] args) {

	}

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB 연결해서 insert, delete, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결하는 메소드
	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "er562312@!";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 사용한 자원 반납하는 메소드
	private void getClose() {

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

	// 회원가입 메소드
	public int join(MemberDTO dto) {
		int row = 0;
		try {
			getConn();
			String sql = "INSERT INTO jdbctest.bigdatamember(ID, PW, B_NAME, AGE, SCORE) VALUES (?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}

////////////////////////// 회원가입 메소드 끝

	// 로그인 메소드
	public MemberDTO login(String id, String pw) {
		MemberDTO dto = null;
		try {
			getConn();

			String sql = "select * from jdbctest.bigdatamember where ID = ? and PW = ? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				// rs에 있는 데이터 DTO 옮기기
				dto = new MemberDTO(null, null, name, age, 0);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return dto;

	}

/////////////////////////// 회원 탈퇴 메소드

	public int delete(String id, String pw) {
		int row = 0;
		try {
			getConn();
			String sql = "delete from jdbctest.bigdatamember where ID = ? and PW = ? ";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

///////////////////////////// 회원 탈퇴 끝
///////////////////////////// 회원 전체 메소드

	public ArrayList<MemberDTO> selectAll() {
		ArrayList<MemberDTO> dtoList = new ArrayList<MemberDTO>();

		try {
			getConn();
			String sql = ("select * from jdbctest.bigdatamember");

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("pw"), rs.getString("b_name"),
						rs.getInt("age"), rs.getInt("score"));
				dtoList.add(dto);
				// 조회 결과(rs)에 있는 데이터 DTO로 옮겨 담기
				// arrayList 이용해서 dto 묶어주기
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return dtoList;
	}

//////////////////////////////////////////////

	public int Update(MemberDTO dto) {
		int row = 0;
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

			psmt.setInt(1, dto.getScore());

			psmt.setString(2, dto.getId());

			psmt.setString(3, dto.getPw());

			row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원 정보 수정 성공");
			} else {
				System.out.println("회원 정보 수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

}