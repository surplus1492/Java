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
		System.out.println("��ü ����");
	}
	
	public static Singleton getInstance() {
		System.out.println("��ü ����");
		return instance;
	}
}