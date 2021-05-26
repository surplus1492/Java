package sub3;

/*
 * 2021/05/25
 * 김영현
 * 다형성 실습
 * 
 * 다형성 ( P o l y m o r p h i s m )
 * - 상속 관계에 있는 부모 클래스의 구체적인 기능을 자식 클래스에서 다시 재정의 하는 기능
 * - 부모 클래스 타입으로 객체를 선언하는 것
 * - 다형성 성질을 이용해서 프로그래밍 코드의 유연성을 높힘
 */

public class PolyTest {
	public static void main(String[] args) {
		//다형성 적용한 객체 생성
		Animal tiger=new Tiger();
		Animal eagle=new Eagle();
		Animal shark=new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
	
		//다형성 활용한 객체 배열
		Tiger obj1=new Tiger();
		Eagle obj2=new Eagle();
		Shark obj3=new Shark();
		
		Animal objects[] = {obj1,obj2,obj3};
		
		for(Animal obj:objects) {
			obj.move();
			obj.hunt();
		}
	}
}
