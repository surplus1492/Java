package sub2;

import java.util.Iterator;

import com.sun.jndi.url.rmi.rmiURLContext;

/*
 * 2021/05/18
 * �迵��
 * �ݺ��� for �ǽ�
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for
		
		for(int i=0;i<=3;i++) {
			System.out.printf("%d Hello Java",i);
			System.out.println();
		}
		
		//1~10 ��
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10 ���� : "+sum);
		
		//1~10 ¦����
		sum=0;
		for (int i=0;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("1~10 ¦�� ���� : "+sum);
		
		//��ø for
		for (int i=1;i<=3;i++) {
			System.out.println("a : "+i);
			for (int j=1;j<=5;j++) {
				System.out.println("b : "+j);
			}
		}
		//������
		for (int i=2;i<=9;i++) {
			System.out.println(i+"��");
			for (int j=1;j<=9;j++) {
				System.out.printf(" | %d X %d = %d | ", i,j,i*j);
			}
			System.out.println();
		}
		//���ﰢ��
		for (int i=0;i<10;i++) {
			for (int j=10;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=0;j<i;j++) {
				System.out.print("**");
			}
			System.out.println();
		}
		
	}
}
