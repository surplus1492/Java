package sub3;

public class Increment {

	public int num1;
	public static int num2;
	
	public Increment(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
	}
	
	
	public static void add() {
		//���� �޼��忡���� static ������ ���� ���� (static ������ �ƴϸ� ������ �ȵ�)
		num2++;//num1�� �Ұ��� 
	}
}
