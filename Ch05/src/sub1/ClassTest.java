package sub1;

/*
 * 2021/05/24
 * �迵��
 * Ŭ���� �ǽ�
 */

public class ClassTest {

	public static void main(String[] args) {
		//��ü ���� + �ʱ�ȭ
		Account kb=new Account("��������","123-1213-1234","������",10000);
		Account wr=new Account("�츮����","121-1010-1021","������",30000);
		
		kb.deposit(40000);
		kb.withdraw(5000);
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		wr.show();
	}
}
