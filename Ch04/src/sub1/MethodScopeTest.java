package sub1;

/*
 * 2021/05/20
 * �迵��
 * methodScope �ǽ�
 */

public class MethodScopeTest {

	static int result=0;
	
	public static void main(String[] args) {
		//���� ���� : method ����� �޸𸮿��� �����
		int start=1,end=10;
		
		result=sum(start, end);
		
		System.out.println(start+"~"+end+" �� : "+result);
	}//main end
	
	public static int sum(int x,int y){
		int sum=0;
		
		for (int i = x; i <= y; i++) {
			sum+=i;
		}
		return sum;
	}
}
