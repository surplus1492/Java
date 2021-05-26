package sub1;

/*
 * 2021/05/24
 * 김영현
 * 클래스 상속 실습
 */

public class InheritanceTest {

	public static void main(String[] args) {
		// public 누구나 사용 가능 private 자신만 사용가능 protected 연결된 것들만 사용 가능 (상속을 받는 자식 클래스는 사용이 가능해짐)
		
		StockAccount kb=new StockAccount("KB증권","121-101-2010","홍길동", 100000, "삼정전자", 10, 80000);
		
		kb.sell(5, 79000);
		kb.buy(10, 81000);
		kb.show();
	}
}
