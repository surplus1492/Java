package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 2021/05/27
 * 김영현
 * 데이터베이스 프로그래밍 실습
 */

public class SelectTest {
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
				
				// 4 단계 - SQL 실행 (Select는 exxecuteQuery로 실행)
				String sql="SELECT * FROM `USER1`";
				ResultSet rs=stmt.executeQuery(sql);//리턴값이 있음
				
				// 5 단계 - SQL 결과 처리(SELECT일 경우)
				while (rs.next()) {
					String uid = rs.getString(1);
					String name = rs.getString(2);
					String hp = rs.getString(3);
					int age = rs.getInt(4);
					
					System.out.print("=============");
					System.out.println("아이디"+uid);
					System.out.println("이름"+name);
					System.out.println("전화번호"+hp);
					System.out.println("나이"+age);
				}
				
				// 6 단계 - 데이터베이스 접속 종료
				conn.close();
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("프로그램 종료...");
	}
}