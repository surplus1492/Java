package test03;

public class test03_05 {
	
	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance();
		
		Car1 avante=factory.createCar("�ƹ���", 2500);
		Car1 sonata=factory.createCar("�ҳ�Ÿ", 3000);
		
		avante.info();
		sonata.info();
	}
}
