package sub2;

/*
 * 2021/05/24
 * �迵��
 * �������̵� �޼��� �ǽ�
 * 
 * 
 * Override �޼���
 * - �θ� Ŭ���� �޼��带 �ڽ� Ŭ�������� �ٽ� �����ϴ� �޼���
 * - �ڽ� Ŭ�������� �θ� Ŭ������ �޼��带 ���� ����
 */

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c=new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);
		
		/* final �ǽ�
		 * final ���� :  ���
		 * (�׻� ������ ������ ����, ������ �Ұ�����)
		 * �빮�ڷ� ���̾�
		 * 
		 * �޼ҵ忡 ���� �������̵� �Ұ�������
		 * Ŭ������ ���� ��� �Ұ���
		 */
		final int NUM=1;
		
		
	}	
}
