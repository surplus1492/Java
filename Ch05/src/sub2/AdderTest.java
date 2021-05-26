package sub2;

/*
 * 2021/05/24
 * 김영현
 * 객체 메모리 생성 실습
 */

public class AdderTest {
	public static void main(String[] args) {

		int[] arr= {10,20,30};
		
		Adder a=new Adder(100);
		
		a.add(100);//1번
		System.out.println("객체 a의 맴버 변수 x : "+a.getX());//100+50
		
		a.add(a);//3번
		System.out.println("객체 a의 맴버 변수 x : "+a.getX());//150+40
		
		a.add(arr);//2번
		System.out.println("객체 a의 맴버 변수 x : "+arr[0]);//10+1
		
		a.addNew(a);//4번
		System.out.println("객체 a의 맴버 변수 x : "+a.getX());//190 재확인 필요 1 나와야함
		
	}
}
