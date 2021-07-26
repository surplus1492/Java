package Ch07;

public class P186 {
	public static void main(String[] args) {
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
	}
}
class Singleton{
	private static Singleton instance=new Singleton();
	
	private Singleton() {
		System.out.println("按眉 积己");
	}
	
	public static Singleton getInstance() {
		System.out.println("按眉 府畔");
		return instance;
	}
}