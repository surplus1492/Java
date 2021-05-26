package test02;

public class test02_02 {
	public static void main(String[] args) {
		int arr[]= {17,92,18,33,58,7,26,42};
		int maxNun=arr[0];
		
		for (int i = 0; i < 8; i++) 
			if (maxNun<arr[i])
				maxNun=arr[i];
		System.out.println("배열 arr에서 가장 큰 수 :"+maxNun);
	}
}
