package Day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {

	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;

	// 기본 생성자
	public JDBConnection() {

		try {
			// JDBC 드라이버 로드
			// MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 에 연결
			// URL:[PORT]/[스키마]?옵션파라미터
			// MySQL
			String url = "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "human";
			String pw = "123456";

			con = DriverManager.getConnection(url, id, pw);

			//System.out.println("DB 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
