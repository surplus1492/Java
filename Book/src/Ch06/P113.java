package Ch06;

public class P113 {
	public static void main(String[] args) {
		int[] number=new int[10];
		
		for (int i = 0; i < number.length; i++) 
			number[i]=i+1;
		
		for (int i = 0; i < number.length; i++) 
			System.out.println(number[i]);
	}
}
