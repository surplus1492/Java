package sub3;

/*
 *2021/05/18
 *김영현
 *배열 실습 
 */

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		
		System.out.println("배열 nums의 원소 갯수 : "+nums.length);
		
		System.out.println("배열 nums의 1번 원소 : "+nums[0]);
		System.out.println("배열 nums의 2번 원소 : "+nums[1]);
		System.out.println("배열 nums의 3번 원소 : "+nums[2]);
		
		for (int num:nums) {
			System.out.println("배열 nums의 원소 : "+num);
		}
		
		String[] poeple= {"김유신","김춘추","장보고","강감찬","이순신"};
		
		for (String person:poeple) {
			System.out.println("people 원소 : "+person);
		}
	}
}
