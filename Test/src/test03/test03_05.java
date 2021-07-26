package test03;

public class test03_05 {
	
	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance();
		
		Car1 avante=factory.createCar("아반테", 2500);
		Car1 sonata=factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
