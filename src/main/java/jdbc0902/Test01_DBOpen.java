package jdbc0902;

import java.sql.DriverManager;

public class Test01_DBOpen {

	public static void main(String[] args) {
        //JDBC (Java Database Connection)
        //Oracle Database XE 18c 연결
		
		//System.out.println("JDBC");
		
		try {
			
			//1) 오라클DB 서버 연결 관련 정보
			String url      = "jdbc:oracle:thin:@localhost:1521:xe";
			String user     = "system";
			String password = "1234";
			String driver   = "oracle.jdbc.driver.OracleDriver";//ojdbc8.jar
			
			//2) 드라이버 로딩
			Class.forName(driver);
			
			
			//3) 오라클 DB 서버 연결
			DriverManager.getConnection(url, user, password);
			
			System.out.println("오라클DB 서버 연결 성공!!");
			
		} catch (Exception e) {
			System.out.println("오라클 DB 연결 실패 : " + e);
		}//end
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
