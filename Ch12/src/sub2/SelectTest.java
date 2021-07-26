package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 2021/05/27
 * �迵��
 * �����ͺ��̽� ���α׷��� �ǽ�
 */

public class SelectTest {
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
				
				// 4 �ܰ� - SQL ���� (Select�� exxecuteQuery�� ����)
				String sql="SELECT * FROM `USER1`";
				ResultSet rs=stmt.executeQuery(sql);//���ϰ��� ����
				
				// 5 �ܰ� - SQL ��� ó��(SELECT�� ���)
				while (rs.next()) {
					String uid = rs.getString(1);
					String name = rs.getString(2);
					String hp = rs.getString(3);
					int age = rs.getInt(4);
					
					System.out.print("=============");
					System.out.println("���̵�"+uid);
					System.out.println("�̸�"+name);
					System.out.println("��ȭ��ȣ"+hp);
					System.out.println("����"+age);
				}
				
				// 6 �ܰ� - �����ͺ��̽� ���� ����
				conn.close();
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("���α׷� ����...");
	}
}