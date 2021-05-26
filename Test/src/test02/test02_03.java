package test02;

public class test02_03 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < 10; i++) 
			System.out.print(arr[i]+", ");
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			int temp=arr[i];
			arr[i]=arr[9-i];
			arr[9-i]=temp;
		}
		
		for (int i = 0; i < 10; i++) 
			System.out.print(arr[i]+", ");
	}
}
