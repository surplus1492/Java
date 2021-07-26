package test03;

public class CarFactory {
	private static CarFactory instance=new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Car1 createCar(String name, int price) {
		return new Car1(name, price);
	}
}
