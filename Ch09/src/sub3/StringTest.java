package sub3;

/*
 * 2021/05/26
 * 김영현
 * String 클래스 실습
 */

public class StringTest {
	public static void main(String[] args) {
		String str="Hello";//문자열 = 문자 + 배열
		char[] arr= {'H','e','l','l','o'};
		
		// 문자열 객체
		String str1=new String("Hello");
		String str2=new String("Hello");
		String str3="Hello";//literal 문자열
		String str4="Hello";
		
		if (str1==str2) {
			System.out.println("참조값이 같다");
		}else {
			System.out.println("참조값이 다르다");
		}
		
		if (str3==str4) {
			System.out.println("참조값이 같다");
		}else {
			System.out.println("참조값이 다르다");
		}
		
		if (str1.equals(str4)) {
			System.out.println("문자열값이 같다");
		}else {
			System.out.println("문자열값이 다르다");
		}
	}
}
