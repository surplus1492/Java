package sub3;

/*
 * 2021/05/25
 * �迵��
 * �������̽� �ǽ�
 */

public class InterfaceTest3 {
	public static void main(String[] args) {
		//�������̽� - ��ü�� ���յ� ��ȭ
		Bulb bulb=new Bulb();
		Socket socket=new Cable(bulb);
		
		socket.switchOn();
		
		socket.switchOff();
		
	}
}
