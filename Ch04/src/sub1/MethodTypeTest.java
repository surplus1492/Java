package sub1;

/*
 * 2021/05/20
 * �迵��
 * method(�Լ�) Type �ǽ�
 */

public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		double r1=type1(1.1);
		double r2=type1(1.2);
		double r3=type1(1.3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		type2(true);
		type2(false);
		
		boolean result=type3();
		System.out.println("type3() : "+result);
		
		type4();
	}//main end
	
	//type1 : �Ű����� 0,���� 0
	public static double type1(double x) {
		double y=x+3.14;
		return y;
	}
	
	//type2 : �Ű����� 0,���� X
	public static void type2(boolean status) {
		if (status) {
			System.out.println("���Դϴ�");
		}
		else {
			System.out.println("�����Դϴ�");
		}
	}
	
	//type3 : �Ű����� X,���� 0
	public static boolean type3() {
		int num1=1,num2=2;
		if (num1 > num2) {
			return true;
		}
		else {
			return false;
		}
	}

	//type4 : �Ű����� X,���� X
	public static void type4() {
		System.out.println("type4() : "+type1(0.1));
	}
}
