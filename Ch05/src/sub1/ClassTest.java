package sub1;

/*
 * 2021/05/24
 * 김영현
 * 클래스 실습
 */

public class ClassTest {

	public static void main(String[] args) {
		//객체 생성 + 초기화
		Account kb=new Account("국민은행","123-1213-1234","김유신",10000);
		Account wr=new Account("우리은행","121-1010-1021","김춘추",30000);
		
		kb.deposit(40000);
		kb.withdraw(5000);
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		wr.show();
	}
}
