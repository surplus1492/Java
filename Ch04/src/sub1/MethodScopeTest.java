package sub1;

/*
 * 2021/05/20
 * 김영현
 * methodScope 실습
 */

public class MethodScopeTest {

	static int result=0;
	
	public static void main(String[] args) {
		//지역 변수 : method 종료시 메모리에서 사라짐
		int start=1,end=10;
		
		result=sum(start, end);
		
		System.out.println(start+"~"+end+" 합 : "+result);
	}//main end
	
	public static int sum(int x,int y){
		int sum=0;
		
		for (int i = x; i <= y; i++) {
			sum+=i;
		}
		return sum;
	}
}
