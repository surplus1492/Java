package sub5;

/*
 * 2021/05/26
 * �迵��
 * Math Ŭ���� �ǽ�
 */

public class MathTest {
	public static void main(String[] args) {
		System.out.println("PI = "+Math.PI);
		System.out.println("���밪 = "+Math.abs(-5));
		System.out.println("���밪 = "+Math.abs(-3.14));
		System.out.println("������ = "+Math.sqrt(9));
		System.out.println("�ø��� = "+Math.ceil(1.2));
		System.out.println("�ø��� = "+Math.ceil(1.8));
		System.out.println("������ = "+Math.floor(1.2));
		System.out.println("������ = "+Math.floor(1.8));
		System.out.println("�ݿø� = "+Math.round(1.2));
		System.out.println("�ݿø� = "+Math.round(1.8));
		
		double num1=Math.random();
		System.out.println("num1 :"+num1);
		
		double num2=num1*10;
		System.out.println("num2 :"+num2);
		
		double num3=Math.ceil(num2);
		System.out.println("num3 :"+num3);
		
		double num=Math.ceil(Math.random()*45);
		System.out.println("num :"+num);
		
		
	}
}
