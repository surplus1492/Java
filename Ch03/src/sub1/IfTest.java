package sub1;

import java.util.Scanner;

/*
 * 2021/-5/18
 * �迵��
 * ���ǹ� if �ǽ�
 */


public class IfTest {
	public static void main(String[] args) {
		
		int num1=1,num2=2,num3=3,num4=4;
		
		//if~
		if(num1<num2) {
			System.out.println("num1�� num2���� �۴�");
		}
		
		if (num1>0) {
			if (num2>1) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��");
			}
		}
		
		if (num1>0 && num2>1) {
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��");
		}
		
		//if~ else
		if (num1>num2) {
			System.out.println("num1�� num2���� ũ��");
		} else {
			System.out.println("num1�� num2���� �۴�");
		}
		
		
		
		//if~ else if~ else
		if (num1>num2) {
			System.out.println("num1�� num2���� ũ��");
		} else if (num2>num3){
			System.out.println("num2�� num3���� ũ��");
		}
		else if (num3>num4) {
			System.out.println("num3�� num4���� ũ��");
		}
		else {
			System.out.println("num4�� ���� ũ��");
		}
		
		//����

		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score=sc.nextInt();		
		
		System.out.println("�Է� ���� : "+score);
		if (score>89) {
			System.out.println("A �Դϴ�");
		}
		else if (score>79) {
			System.out.println("B �Դϴ�");
		}
		else if (score>69) {
			System.out.println("C �Դϴ�");
		}
		else if (score>59) {
			System.out.println("D �Դϴ�");
		}
		else {
			System.out.println("F �Դϴ�");
		}
	}
}
