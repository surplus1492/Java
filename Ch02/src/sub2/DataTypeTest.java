package sub2;

/*
 * 2021/05/17
 * �迵��
 * �ڹ� ������ �ڷ���  �ǽ�
 */

public class DataTypeTest {
	public static void main(String[] args) {

		//������
		byte num1=127;
		short num2=32767;
		int num3=2137483647;
		long num4=1000L;
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		System.out.println("num3 :"+num3);
		System.out.println("num4 :"+num4);
		//�Ǽ���
		float var1=1.123456789f;
		double var2=1.12345677890123456789;
		
		System.out.println("var1 :"+var1);
		System.out.println("var2 :"+var2);
		//����
		boolean value1=true;
		boolean value2=false;
		
		System.out.println("value1 :"+value1);
		System.out.println("value2 :"+value2);
		//������
		char ch1='A';
		char ch2='��';
		
		System.out.println("ch1 :"+ch1);
		System.out.println("ch2 :"+ch2);
		//���ڿ�
		String str1="Apple";
		String str2="����";
		
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
	}
}
