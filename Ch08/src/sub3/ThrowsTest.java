package sub3;

/*
 * 2021/05/25
 * 김영현
 * 예외 던지기 실습
 */

public class ThrowsTest {
	public static void main(String[] args) {
		Calc calc=Calc.getInstance();
		
		int r1=0,r2=0,r3=0;
		
		try {
			r1=calc.div(1, 2);
			r2=calc.div(1, 0);
			r3=calc.div(1, -1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
	}
}
