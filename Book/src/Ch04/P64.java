package Ch04;

public class P64 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
//		System.out.println(b>0&(a/b>0)); // 0으로 나누려고 해서 에러 발생
		
		System.out.println(b>0 && (a/b>0));
	}
}
