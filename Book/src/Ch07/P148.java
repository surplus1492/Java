package Ch07;

public class P148 {
	public static void main(String[] args) {
		
		System.out.println("Avante ������ : "+Avante.company);
		
		Avante a1=new Avante();
		Avante a2=new Avante();
		
		a1.color="ȭ��Ʈ";
		a2.color="��";
		
		System.out.println("a1 ���� : "+a1.color);
		System.out.println("a2 ���� : "+a2.color);
		
		System.out.println("a1 ȸ�� : "+a1.company);
		System.out.println("a2 ȸ�� : "+a2.company);
		
		a1.company="���";
		
		System.out.println("Avante ȸ�� : "+Avante.company);
		System.out.println("a1 ȸ�� : "+a1.company);
		System.out.println("a2 ȸ�� : "+a2.company);
	}
}

class Avante{
	String color;
	static String company="����";
}