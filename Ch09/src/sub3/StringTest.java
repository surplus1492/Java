package sub3;

/*
 * 2021/05/26
 * �迵��
 * String Ŭ���� �ǽ�
 */

public class StringTest {
	public static void main(String[] args) {
		String str="Hello";//���ڿ� = ���� + �迭
		char[] arr= {'H','e','l','l','o'};
		
		// ���ڿ� ��ü
		String str1=new String("Hello");
		String str2=new String("Hello");
		String str3="Hello";//literal ���ڿ�
		String str4="Hello";
		
		if (str1==str2) {
			System.out.println("�������� ����");
		}else {
			System.out.println("�������� �ٸ���");
		}
		
		if (str3==str4) {
			System.out.println("�������� ����");
		}else {
			System.out.println("�������� �ٸ���");
		}
		
		if (str1.equals(str4)) {
			System.out.println("���ڿ����� ����");
		}else {
			System.out.println("���ڿ����� �ٸ���");
		}
	}
}
