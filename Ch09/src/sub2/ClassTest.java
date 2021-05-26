package sub2;

import sub1.Apple;

/*
 * 2021/05/25
 * 김영현
 * 내장클래스(기본 API 클래스) 실습
 */

public class ClassTest {
	public static void main(String[] args) {
		
		//Class 클래스 : 객체를 동적 생성할 때 사용하는 클래스
		Apple a1=new Apple("한국",3000);
		a1.toString();
		
		try {
			Class cls=Class.forName("sub1.Apple");
			Apple a2=(Apple)cls.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
