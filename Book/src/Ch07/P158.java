package Ch07;

public class P158 {
	public static void main(String[] args) {
		Method.printName();
		
		Method method=new Method();
		
		method.printEmail();
	}
}
class Method{
	static void printName() {
		System.out.println("printName() ����");
	}
	
	void printEmail() {
		System.out.println("printEmail() ����");
		
		printId();
	}
	void printId() {
		System.out.println("printId() ����");
	}
}