package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2021/05/27
 * �迵��
 * ���� ����� ��Ʈ�� �ǽ�
 */

public class FileIOTest {
	public static void main(String[] args) {
		
		String path1="C:\\Users\\6�� �迵��\\Desktop\\test1.txt";
		String path2="C:\\Users\\6�� �迵��\\Desktop\\test2.txt";
		
		// ���ϰ� �Է½�Ʈ��(path1) ��½�Ʈ��(path2) ����
		try {
			FileInputStream fis=new FileInputStream(path1);
			FileOutputStream fos=new FileOutputStream(path2);
			int value=0;
			while (true) {
				value=fis.read();
				if (value==-1)
					break;
				fos.write(value);
//				char ch=(char)value; // ���� �о ����ϴ� ����
//				System.out.print(ch);
			}//while end
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("���α׷� ����");
	}//main end
}
