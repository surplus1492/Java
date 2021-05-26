package sub2;

public class BBB extends AAA{

	@Override
	public void method1() {
		System.out.println("BBB - method1...");
	}
	
	//Overload
	public void method2(int a) {
		System.out.println("BBB - method2...");
	}
	
	//Overload
	public void method3() {
		System.out.println("BBB - method3...");
	}
}
