package jdbc0902;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test03_update {

	public static void main(String[] args) {
		//sungjuk 테이블 행 수정 연습
		
		try {
			
			String url      = "jdbc:oracle:thin:@localhost:1521:xe";
			String user     = "system";
			String password = "1234";
			String driver   = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);			
			System.out.println("오라클DB 서버 연결 성공!!");
			
			
			StringBuilder sql = new StringBuilder();
			sql.append(" UPDATE sungjuk ");
			sql.append(" SET tot=kor+eng+mat ");
			sql.append(" , aver=(kor+eng+mat)/3 ");
			sql.append(" WHERE sno=121 ");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			int cnt = pstmt.executeUpdate(); //실행한 행의 갯수가 반환
			System.out.println("실행결과 : " + cnt);
			if(cnt==0) {
				System.out.println("행 수정 실패!!");
			} else {
				System.out.println("행 수정 성공~~");
			}//if end
			
			//자원반납 (순서주의)
			pstmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("오라클 JDBC 행 수정 실패 : " + e);
		}//end
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
