package sub2;

/*
 * 2021/05/24
 * �迵��
 * ��ü �޸� ���� �ǽ�
 */

public class AdderTest {
	public static void main(String[] args) {

		int[] arr= {10,20,30};
		
		Adder a=new Adder(100);
		
		a.add(100);//1��
		System.out.println("��ü a�� �ɹ� ���� x : "+a.getX());//100+50
		
		a.add(a);//3��
		System.out.println("��ü a�� �ɹ� ���� x : "+a.getX());//150+40
		
		a.add(arr);//2��
		System.out.println("��ü a�� �ɹ� ���� x : "+arr[0]);//10+1
		
		a.addNew(a);//4��
		System.out.println("��ü a�� �ɹ� ���� x : "+a.getX());//190 ��Ȯ�� �ʿ� 1 ���;���
		
	}
}
