package Day15.Board.DAO;

import java.util.LinkedList;
import java.util.List;

import Day15.JDBConnection;
import Day15.Board.DTO.Board;

public class BoardDAO extends JDBConnection {

	// 데이터 목록 조회
	public List<Board> selectList() {

		LinkedList<Board> boardList = new LinkedList<>();

		String sql = " SELECT * " + " FROM board ";
		try {
			stmt = con.createStatement(); // 쿼리문 생성
			rs = stmt.executeQuery(sql); // 쿼리 실행

			while (rs.next()) {
				Board board = new Board();
				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setUpd_date(rs.getTimestamp("upd_date"));

				boardList.add(board);
			}
		} catch (Exception e) {
			System.out.println("게시글 목록 조회 시, 예외 발생");
			e.printStackTrace();
		}

		return boardList;
	}

	// 데이터 조회
	public Board select(int board_no) {

		Board board = new Board();

		String sql = " SELECT * " + " FROM board " + " WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setInt(1, board_no); // 파라미터 매핑
			rs = psmt.executeQuery(); // 쿼리 실행

			if (rs.next()) {
				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getTimestamp("reg_date"));
				board.setUpd_date(rs.getTimestamp("upd_date"));

			} else {
				System.out.println(board_no + "번의 게시글이 존재하지 않습니다.");
				board = null;
			}
		} catch (Exception e) {
			System.out.println("게시글 조회 시, 예외 발생");
			e.printStackTrace();
		}

		return board;
	}

	// 데이터 등록
	public int insert(Board board) {

		int result = 0;
		String sql = "INSERT INTO board (title, writer, content)" + "VALUES(?, ?, ?)";

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			result = psmt.executeUpdate(); // SQL 실행 요청

			// executeQuery() : 데이터 조회
			// executeUpdate() : 데이터 추가/수정/삭제 -- 적용된 행(데이터)의 수를 반환

		} catch (Exception e) {
			System.out.println("게시글 등록 시, 예외 발생");
			e.printStackTrace();

		}
		return result;
	}

	// 데이터 수정
	public int update(Board board) {

		int result = 0;
		String sql = " UPDATE board "
				   + "SET title = ? " 
				   + "	  ,writer = ? " 
				   + "	  ,content = ? "
				   + "	  ,upd_date = now() "
				   + " WHERE board_no = ? ";

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			psmt.setInt(4, board.getBoard_no());
			result = psmt.executeUpdate(); // SQL 실행 요청

			// executeQuery() : 데이터 조회
			// executeUpdate() : 데이터 추가/수정/삭제 -- 적용된 행(데이터)의 수를 반환

		} catch (Exception e) {
			System.out.println("게시글 수정 시, 예외 발생");
			e.printStackTrace();

		}
		return result;
	}

	// 데이터 삭제
	public int delete(int board_no) {

		int result = 0;
		String sql = " DELETE FROM board " 
				   + " WHERE board_no = ? "; 

		try {
			psmt = con.prepareStatement(sql); // 쿼리문 생성
			psmt.setInt(1, board_no);
			result = psmt.executeUpdate(); // SQL 실행 요청

			// executeQuery() : 데이터 조회
			// executeUpdate() : 데이터 추가/수정/삭제 -- 적용된 행(데이터)의 수를 반환

		} catch (Exception e) {
			System.out.println("게시글 삭제 시, 예외 발생");
			e.printStackTrace();

		}
		return result;
	}
}
