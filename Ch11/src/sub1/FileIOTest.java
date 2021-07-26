package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2021/05/27
 * 김영현
 * 파일 입출력 스트림 실습
 */

public class FileIOTest {
	public static void main(String[] args) {
		
		String path1="C:\\Users\\6기 김영현\\Desktop\\test1.txt";
		String path2="C:\\Users\\6기 김영현\\Desktop\\test2.txt";
		
		// 파일과 입력스트림(path1) 출력스트림(path2) 연결
		try {
			FileInputStream fis=new FileInputStream(path1);
			FileOutputStream fos=new FileOutputStream(path2);
			int value=0;
			while (true) {
				value=fis.read();
				if (value==-1)
					break;
				fos.write(value);
//				char ch=(char)value; // 파일 읽어서 출력하는 문구
//				System.out.print(ch);
			}//while end
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}//main end
}
