package test03;

public class Computer extends Product{
	public Computer(String category,int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("제품분류 :"+category);
		System.out.println("제품가격 :"+price);
	}
}
