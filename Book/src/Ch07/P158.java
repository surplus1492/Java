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
		System.out.println("printName() 실행");
	}
	
	void printEmail() {
		System.out.println("printEmail() 실행");
		
		printId();
	}
	void printId() {
		System.out.println("printId() 실행");
	}
}