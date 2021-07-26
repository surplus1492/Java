package Ch06;

public class P127 {
	public static void main(String[] args) {
		int[] arrInt= {1,2,3,4,5};
		
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		for(int number:arrInt)
			System.out.println(number);
	}
}
