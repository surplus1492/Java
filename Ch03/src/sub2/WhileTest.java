package sub2;

/*
 * 2021/05/18
 * �迵��
 * �ݺ��� while �ǽ�
 */

public class WhileTest {
	public static void main(String[] args) {
		int k=1,sum=0;
		
		while (k<=10) {
			sum+=k;
			k++;
		}
		
		System.out.println("1~10 �� : "+sum);
		sum=0;k=10;
		do {
			sum+=k;
			k+=2;
		}
		while(k<=10);
		
		System.out.println("1~10 ¦�� �� : "+sum);
		
		
		int num=1;
		
		while (true) {
			num++;
			if (num%5==0&&num%7==0) {
				break;
			}
		}
		
		System.out.println("5�� 7�� �ּҰ���� : "+num);
		
		int total=0;
		
		for (int i=1;i<=10;i++) {
			
			if (i%2==1) {
				continue;
			}
			total+=i;
		}
		
		System.out.println("1~10 ¦�� �� :"+total);
		
		
	}
}
