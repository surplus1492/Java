package test01;

import java.util.Scanner;

public class test01_06 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score=scanner.nextInt();
		
		System.out.println("입력한 점수는 "+score+"입니다");
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("등급은 A입니다");
			break;
		case 8:
			System.out.println("등급은 B입니다");
			break;
		case 7:
			System.out.println("등급은 C입니다");
			break;
		case 6:
			System.out.println("등급은 D입니다");
			break;

		default:
			System.out.println("등급은 F입니다");
			break;
		}
	}
}
