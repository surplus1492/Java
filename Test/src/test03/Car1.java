package test03;

public class Car1 {
	private String name;
	private int price;
	
	public Car1(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public void info() {
		System.out.println("===========");
		System.out.println("������ :"+name);
		System.out.println("�� �� :"+price);
	}
}
