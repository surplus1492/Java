package sub1;

/*
 * 2021/05/25
 * �迵��
 * �������̽� �ǽ�
 */

public class InterfaceTest1 {
	public static void main(String[] args) {
		//�������̽� - Ŭ���� ������ ǥ�� ���̵� ��Ȱ
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
