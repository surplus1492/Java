package sub1;

import java.util.Scanner;

/*
 * 2021/-5/18
 * 김영현
 * 조건문 if 실습
 */


public class IfTest {
	public static void main(String[] args) {
		
		int num1=1,num2=2,num3=3,num4=4;
		
		//if~
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다");
		}
		
		if (num1>0) {
			if (num2>1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
		}
		
		if (num1>0 && num2>1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		
		//if~ else
		if (num1>num2) {
			System.out.println("num1이 num2보다 크다");
		} else {
			System.out.println("num1이 num2보다 작다");
		}
		
		
		
		//if~ else if~ else
		if (num1>num2) {
			System.out.println("num1이 num2보다 크다");
		} else if (num2>num3){
			System.out.println("num2이 num3보다 크다");
		}
		else if (num3>num4) {
			System.out.println("num3이 num4보다 크다");
		}
		else {
			System.out.println("num4가 가장 크다");
		}
		
		//연습

		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score=sc.nextInt();		
		
		System.out.println("입력 점수 : "+score);
		if (score>89) {
			System.out.println("A 입니다");
		}
		else if (score>79) {
			System.out.println("B 입니다");
		}
		else if (score>69) {
			System.out.println("C 입니다");
		}
		else if (score>59) {
			System.out.println("D 입니다");
		}
		else {
			System.out.println("F 입니다");
		}
	}
}
