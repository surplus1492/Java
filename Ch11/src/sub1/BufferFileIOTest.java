package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2021/05/27
 * 김영현
 * 파일 입출력 버퍼 실습
 */

public class BufferFileIOTest {
	public static void main(String[] args) {
		
		String path1="C:\\Users\\6기 김영현\\Desktop\\sample.jpg";
		String path2="C:\\Users\\6기 김영현\\Desktop\\sample2.jpg";
		
		// 파일과 입력스트림(path1) 출력스트림(path2) 연결
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(path2));
			
			int value=0;
			
			while (true) {
				value=bis.read();
				if (value==-1)
					break;
				bos.write(value);
			}//while end
			
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}//main end
}