package Ch07;

public class P175 {
	
}
class InitEx{
	public InitEx() {
		System.out.println("������ ȣ��");
	}
	
	static {
		System.out.println("Ŭ���� �ʱ�ȭ �� ����");
	}
	
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ���� ");
	}
	
	public static void main(String[] args) {
		System.out.println("���� �޼��� ����");
		System.out.println("���� inti1 ��ü ����");
		InitEx init1=new InitEx();
		System.out.println("���� init2 ��ü ����");
		InitEx init2=new InitEx();
	}
	
}