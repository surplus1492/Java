package test01;

public class test01_10 {
	public static void main(String[] args) {
		int n1=1,n2=2,n3;
		
		System.out.print(n1+" ");
		System.out.print(n2+", ");
		
		for (int i = 1; i <= 10; i++) {
			n3=n1+n2;
			System.out.print(n3+", ");
			
			n1=n2;
			n2=n3;
		}
	}
}
