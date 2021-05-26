package sub2;

/*
 * 2021/05/25
 * 김영현
 * 인터페이스 실습
 */

public class InterfaceTest2 {
	public static void main(String[] args) {
		//인터페이스 - 다중상속 효과
		SmartTv smartTv=new SmartTv();
		
		smartTv.powerOn();
		smartTv.booting();
		smartTv.internet();
		smartTv.powerOff();
		
	}
}
