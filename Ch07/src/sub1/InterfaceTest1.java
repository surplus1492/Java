package sub1;

/*
 * 2021/05/25
 * 김영현
 * 인터페이스 실습
 */

public class InterfaceTest1 {
	public static void main(String[] args) {
		//인터페이스 - 클래스 설계의 표준 가이드 역활
		RemoteControl lg=new RemoteLG();
		RemoteControl samsung=new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.powerOff();
	}
}
