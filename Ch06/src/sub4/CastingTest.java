package sub4;

import sub3.Animal;
import sub3.Eagle;
import sub3.Shark;
import sub3.Tiger;

/*
 * 2021/05/25
 * �迵��
 * ��ĳ����,�ٿ�ĳ���� �ǽ�
 */

public class CastingTest {

	public static void main(String[] args) {
		int num1=1;
		double num2=num1;
		int num3=(int)num2;
		
		System.out.println("num1"+num1);
		System.out.println("num2"+num2);
		System.out.println("num3"+num3);
		
		
		//��ĳ����
		Animal a1=new Tiger();
		Animal a2=new Eagle();
		Animal a3=new Shark();
		
		
		//�ٿ�ĳ����
		Tiger tiger=(Tiger)a1;
		Eagle eagle=(Eagle)a2;
		Shark shark=(Shark)a3;
		
		if (a1 instanceof Tiger) {
			System.out.println("a1�� Tiger �Դϴ�");
		}else if (a1 instanceof Eagle) {
			System.out.println("a1�� Eagle �Դϴ�");
		}else if (a1 instanceof Shark) {
			System.out.println("a1�� Shark �Դϴ�");
		}
	}
}
