package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 * 2021/05/27
 * �迵��
 * property �ǽ�
 */

public class PropertyTest {
	public static void main(String[] args) {
		String path="C:\\Users\\6�� �迵��\\Desktop\\city.properties";
		
		Properties props=new Properties();
		
	try {
		FileInputStream fis=new FileInputStream(path);
		
		props.load(fis);
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("101�� ���� : "+props.getProperty("101"));
	
	}
}
