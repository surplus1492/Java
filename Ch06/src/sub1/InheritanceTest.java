package sub1;

/*
 * 2021/05/24
 * �迵��
 * Ŭ���� ��� �ǽ�
 */

public class InheritanceTest {

	public static void main(String[] args) {
		// public ������ ��� ���� private �ڽŸ� ��밡�� protected ����� �͵鸸 ��� ���� (����� �޴� �ڽ� Ŭ������ ����� ��������)
		
		StockAccount kb=new StockAccount("KB����","121-101-2010","ȫ�浿", 100000, "��������", 10, 80000);
		
		kb.sell(5, 79000);
		kb.buy(10, 81000);
		kb.show();
	}
}
