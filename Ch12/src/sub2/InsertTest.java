package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 2021/05/27
 * �迵��
 * �����ͺ��̽� ���α׷��� �ǽ�
 */

public class InsertTest {
	public static void main(String[] args) {
		
		// DB����
				String host="jdbc:mysql://192.168.10.114:3306/dudgus960408";
				String user="dudgus960408";
				String pass="1234";
				
				try { // 2,3�ܰ��� ������ ���� java.sql ��Ű���� �ִ°����� �� 
				// 1 �ܰ� - JDBC ����̹� �ε�
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2 �ܰ� - �����ͺ��̽� ����
				Connection conn=DriverManager.getConnection(host,user,pass);
				
				// 3 �ܰ� - SQL ���ఴü ����
				Statement stmt=conn.createStatement();
				
				// 4 �ܰ� - SQL ����
				String sql="INSERT INTO `USER1` VALUES('j101','������','010-1211-1010',27)";
				stmt.executeUpdate(sql);
				
				// 5 �ܰ� - SQL ��� ó��(SELECT�� ���)
				// 6 �ܰ� - �����ͺ��̽� ���� ����
				conn.close();
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("���α׷� ����...");
	}
}
