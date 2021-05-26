package sub3;

/*
 * 2021/05/24
 * 김영현
 * 정적 변수(클래스 변수),정적 메서드(클래스 메서드) 실습
 */

public class StaticTest {

	public static void main(String[] args) {
		Increment inc1=new Increment();
		Increment inc2=new Increment();
		Increment inc3=new Increment();
		
		/*
		 - 정적 변수는 하나의 인스턴스로 관리되어 참조함 
		 - 정적 변수는 고정 할당영역(Method Area)에 생성되어 있기 때문에 객체 생성 없이 바로 참조 가능함
		 */
		Increment.num2+=3;// inc1+=3; 으로도 쓸수는 있음
		
		Increment.add();
		
		//싱글톤 객체  -  교제 p185 
		
		Calc c=Calc.getInstance();
		int r1=c.plus(1, 2);
		int r2=c.minus(1, 2);
		int r3=c.multi(3, 2);
		int r4=c.div(4, 2);
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		System.out.println("r3 :"+r3);
		System.out.println("r4 :"+r4);
		}
}
