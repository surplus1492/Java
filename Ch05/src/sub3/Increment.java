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
		//정적 메서드에서는 static 변수만 참조 가능 (static 변수가 아니면 참조가 안됨)
		num2++;//num1은 불가능 
	}
}
