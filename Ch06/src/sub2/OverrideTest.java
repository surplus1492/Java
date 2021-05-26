package sub2;

/*
 * 2021/05/24
 * 김영현
 * 오버라이드 메서드 실습
 * 
 * 
 * Override 메서드
 * - 부모 클래스 메서드를 자식 클래스에서 다시 정의하는 메서드
 * - 자식 클래스에서 부모 클래스의 메서드를 덮어 씌움
 */

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c=new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);
		
		/* final 실습
		 * final 변수 :  상수
		 * (항상 고정된 값으로 있음, 연산이 불가능함)
		 * 대문자로 많이씀
		 * 
		 * 메소드에 사용시 오버라이드 불가능해짐
		 * 클래스에 사용시 상속 불가능
		 */
		final int NUM=1;
		
		
	}	
}
