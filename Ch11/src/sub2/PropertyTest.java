package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 * 2021/05/27
 * 김영현
 * property 실습
 */

public class PropertyTest {
	public static void main(String[] args) {
		String path="C:\\Users\\6기 김영현\\Desktop\\city.properties";
		
		Properties props=new Properties();
		
	try {
		FileInputStream fis=new FileInputStream(path);
		
		props.load(fis);
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("101번 도시 : "+props.getProperty("101"));
	
	}
}
