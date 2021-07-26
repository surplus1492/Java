package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 2021/05/27
 * 김영현
 * 데이터베이스 프로그래밍 실습
 */

public class InsertTest {
	public static void main(String[] args) {
		
		// DB정보
				String host="jdbc:mysql://192.168.10.114:3306/dudgus960408";
				String user="dudgus960408";
				String pass="1234";
				
				try { // 2,3단계의 종류는 전부 java.sql 패키지에 있는것으로 함 
				// 1 단계 - JDBC 드라이버 로드
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2 단계 - 데이터베이스 접속
				Connection conn=DriverManager.getConnection(host,user,pass);
				
				// 3 단계 - SQL 실행객체 생성
				Statement stmt=conn.createStatement();
				
				// 4 단계 - SQL 실행
				String sql="INSERT INTO `USER1` VALUES('j101','김유신','010-1211-1010',27)";
				stmt.executeUpdate(sql);
				
				// 5 단계 - SQL 결과 처리(SELECT일 경우)
				// 6 단계 - 데이터베이스 접속 종료
				conn.close();
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("프로그램 종료...");
	}
}
