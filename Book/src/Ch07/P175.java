package Ch07;

public class P175 {
	
}
class InitEx{
	public InitEx() {
		System.out.println("생성자 호출");
	}
	
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	{
		System.out.println("인스턴스 초기화 블럭 실행 ");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메서드 시작");
		System.out.println("메인 inti1 객체 생성");
		InitEx init1=new InitEx();
		System.out.println("메인 init2 객체 생성");
		InitEx init2=new InitEx();
	}
	
}