package sub3;

/*
 * 2021/05/26
 * �迵��
 * String �ɹ�Ŭ���� �ǽ�
 */

public class StringMemberTest {
	public static void main(String[] args) {
		String str="Hello Korea";
		
		//length ���� ����
		System.out.println("str ����"+str.length());
		
		//charAt Ư�� ���� ����
		System.out.println("str 1�� ���� :"+str.charAt(0));
		System.out.println("str 7�� ���� :"+str.charAt(6));
		
		//subString ���ڿ� �ڸ���
		System.out.println("str 0~5 : "+str.substring(0,5));
		System.out.println("str 6~ : "+str.substring(6));
		
		//indexOf,lastIndexOf  Ư������ �ε��� ����
		System.out.println("str �տ��� ���� ���� e �ε��� :"+str.indexOf("e"));
		System.out.println("str �ڿ��� ���� ���� e �ε��� :"+str.lastIndexOf("e"));
		
		//replace ���ڿ� ��ü
		System.out.println("str ���� 'Korea'�� 'Busan'���� ��ü :"+str.replace("Korea", "Busan"));
		System.out.println("str ���� 'Hello'�� 'Welcome'���� ��ü :"+str.replace("Hello", "Welcome"));
		
		//valueOf �⺻Ÿ�� ������ ���ڿ��� ��ȯ
		int var1=1;
		double var2=2.13;
		boolean var3=true;
		
		String s1=String.valueOf(var1);
		String s2=String.valueOf(var2);
		String s3=String.valueOf(var3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
