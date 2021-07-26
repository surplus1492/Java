package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2021/05/27
 * �迵��
 * ���� ����� ���� �ǽ�
 */

public class BufferFileIOTest {
	public static void main(String[] args) {
		
		String path1="C:\\Users\\6�� �迵��\\Desktop\\sample.jpg";
		String path2="C:\\Users\\6�� �迵��\\Desktop\\sample2.jpg";
		
		// ���ϰ� �Է½�Ʈ��(path1) ��½�Ʈ��(path2) ����
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
		
		
		System.out.println("���α׷� ����");
	}//main end
}