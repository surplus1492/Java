package sub1;

/*
 * 2021/05/25
 * 김영현
 * 내장클래스(기본 API 클래스) 실습
 */

public class ObjectTest {
	public static void main(String[] args) {
		
		/* Object 클래스
		 *  자바의 최상위 클래스
		 *  자바의 모든 클래스는 Object 클래스를 상속 받는다
		 *  다형성에 활용
		 */
		
		Object apple=new Apple("한국",3000);
		Object banana=new Banana("대만",5000);
		
		apple.toString();
		banana.toString();
	}
}
