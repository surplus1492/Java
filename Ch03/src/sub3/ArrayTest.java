package sub3;

/*
 *2021/05/18
 *�迵��
 *�迭 �ǽ� 
 */

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		
		System.out.println("�迭 nums�� ���� ���� : "+nums.length);
		
		System.out.println("�迭 nums�� 1�� ���� : "+nums[0]);
		System.out.println("�迭 nums�� 2�� ���� : "+nums[1]);
		System.out.println("�迭 nums�� 3�� ���� : "+nums[2]);
		
		for (int num:nums) {
			System.out.println("�迭 nums�� ���� : "+num);
		}
		
		String[] poeple= {"������","������","�庸��","������","�̼���"};
		
		for (String person:poeple) {
			System.out.println("people ���� : "+person);
		}
	}
}
