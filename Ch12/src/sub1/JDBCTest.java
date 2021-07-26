package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

/*
 * 2021/05/27
 * 김영현
 * 데이터베이스 프로그래밍 실습
 */

public class JDBCTest {
	public static void main(String[] args) {
		
		// DB정보
		String host="jdbc:mysql://192.168.10.114:3306/dudgus960408";
		String user="dudgus960408";
		String pass="1234";
		
		try {
		// 1 단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2 단계 - 데이터베이스 접속
		Connection conn=DriverManager.getConnection(host,user,pass);
		
		if(conn!=null) {
			System.out.println("데이터베이스 접속 성공");
		}else {
			System.out.println("데이터베이스 접속 실패");
		}
		
		// 3 단계 - SQL 실행객체 생성
		// 4 단계 - SQL 실행
		// 5 단계 - SQL 결과 처리(SELECT일 경우)
		// 6 단계 - 데이터베이스 접속 종료
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}