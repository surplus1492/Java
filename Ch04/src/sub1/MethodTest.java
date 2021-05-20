package sub1;

/*
 * 2021/05/20
 * 김영현
 * method(함수) 실습
 */

public class MethodTest {
	//main method : 프로그램 시작점
	public static void main(String[] args) {
		int y1=f(1);
		int y2=f(2);
		int y3=f(3);
		
		System.out.println("y1 ="+y1);
		System.out.println("y2 ="+y2);
		System.out.println("y3 ="+y3);
		
		System.out.println("1~10 합 : "+sum(1, 10));
		System.out.println("1~100 합 : "+sum(1, 100));
		System.out.println("1~1000 합 : "+sum(1, 1000));
	}
	//method : 일련의 코드로직을 모듈화 시킨 것
	public static int f(int x) {
		int y=2*x+3;
		return y;
	}
	
	public static int sum(int start,int end) {
		int sum=0;
		
		for (int i = start; i <= end; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
