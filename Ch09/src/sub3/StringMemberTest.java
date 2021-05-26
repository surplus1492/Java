package sub3;

/*
 * 2021/05/26
 * 김영현
 * String 맴버클래스 실습
 */

public class StringMemberTest {
	public static void main(String[] args) {
		String str="Hello Korea";
		
		//length 문자 갯수
		System.out.println("str 길이"+str.length());
		
		//charAt 특정 문자 추출
		System.out.println("str 1번 문자 :"+str.charAt(0));
		System.out.println("str 7번 문자 :"+str.charAt(6));
		
		//subString 문자열 자르기
		System.out.println("str 0~5 : "+str.substring(0,5));
		System.out.println("str 6~ : "+str.substring(6));
		
		//indexOf,lastIndexOf  특정문자 인덱스 추출
		System.out.println("str 앞에서 부터 문자 e 인덱스 :"+str.indexOf("e"));
		System.out.println("str 뒤에서 부터 문자 e 인덱스 :"+str.lastIndexOf("e"));
		
		//replace 문자열 교체
		System.out.println("str 에서 'Korea'를 'Busan'으로 교체 :"+str.replace("Korea", "Busan"));
		System.out.println("str 에서 'Hello'를 'Welcome'으로 교체 :"+str.replace("Hello", "Welcome"));
		
		//valueOf 기본타입 변수를 문자열로 변환
		int var1=1;
		double var2=2.13;
		boolean var3=true;
		
		String s1=String.valueOf(var1);
		String s2=String.valueOf(var2);
		String s3=String.valueOf(var3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
