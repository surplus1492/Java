package sub3;

/*
 * 2021/05/25
 * 김영현
 * 인터페이스 실습
 */

public class InterfaceTest3 {
	public static void main(String[] args) {
		//인터페이스 - 객체간 결합도 완화
		Bulb bulb=new Bulb();
		Socket socket=new Cable(bulb);
		
		socket.switchOn();
		
		socket.switchOff();
		
	}
}
