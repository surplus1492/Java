package sub1;

import java.util.Scanner;

/*
 * 2021/-5/18
 * �迵��
 * ���ǹ� switch �ǽ�
 */

public class SwitchTest {

	public static void main(String[] args) {
		
		String animal="tiger";
		
		switch (animal) {
		case "lion":
			System.out.println("animal�� lion�Դϴ�");
			break;
		case "eagle":
			System.out.println("animal�� eagle�Դϴ�");
			break;
		case "tiger":
			System.out.println("animal�� tiger�Դϴ�");
			break;
		default:
			System.out.println("animal�� lion,eagle,tiger�� �ƴմϴ�");
			break;
		}
		
		//����
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int score=sc.nextInt();
		System.out.println("���� :"+score);
		
		switch (score/10) {
		case 10:
			System.out.println("A �Դϴ�");
			break;
		case 9:
			System.out.println("A �Դϴ�");
			break;
		case 8:
			System.out.println("B �Դϴ�");
			break;
		case 7:
			System.out.println("C �Դϴ�");
			break;
		case 6:
			System.out.println("D �Դϴ�");
			break;
		default:
			System.out.println("F �Դϴ�");
			break;
		}
		
	}
}
