package Ch07;

public class P144 {
	String color;
	String company;
	String type;
	
	public void go() {
		System.out.println("�����Ѵ�");
	}
	public void back() {
		System.out.println("�����Ѵ�");
	}
}

class P144_Main{
	
	public static void main(String[] args) {
		P144 tico=new P144();
		P144 pride=new P144();
		
		tico.color="ȭ��Ʈ";
		tico.company="���";
		tico.type="����";
		
		pride.color="�ҷ�";
		pride.company="���";
		pride.type="����";
		
		tico.go();
		pride.go();
		
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}
}