package Ch07;

public class P144 {
	String color;
	String company;
	String type;
	
	public void go() {
		System.out.println("전진한다");
	}
	public void back() {
		System.out.println("후진한다");
	}
}

class P144_Main{
	
	public static void main(String[] args) {
		P144 tico=new P144();
		P144 pride=new P144();
		
		tico.color="화이트";
		tico.company="대우";
		tico.type="경차";
		
		pride.color="불랙";
		pride.company="기아";
		pride.type="소형";
		
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