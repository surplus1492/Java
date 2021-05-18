package sub2;

import java.util.Iterator;

import com.sun.jndi.url.rmi.rmiURLContext;

/*
 * 2021/05/18
 * 김영현
 * 반복문 for 실습
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for
		
		for(int i=0;i<=3;i++) {
			System.out.printf("%d Hello Java",i);
			System.out.println();
		}
		
		//1~10 합
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10 합은 : "+sum);
		
		//1~10 짝수합
		sum=0;
		for (int i=0;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("1~10 짝수 합은 : "+sum);
		
		//중첩 for
		for (int i=1;i<=3;i++) {
			System.out.println("a : "+i);
			for (int j=1;j<=5;j++) {
				System.out.println("b : "+j);
			}
		}
		//구구단
		for (int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for (int j=1;j<=9;j++) {
				System.out.printf(" | %d X %d = %d | ", i,j,i*j);
			}
			System.out.println();
		}
		//별삼각형
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
