package sub1;

public class Account {

	//속성(변수) : private 선언으로 캡슐화
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// 생성자  변수를 초기화 하기 위한 매서드
	public Account(String bank,String id,String name,int money) {
		this.bank=bank;
		this.id=id;
		this.name=name;
		this.money=money;
	}

	//기능 (매소드)
	public void deposit(int money) {
		this.money+=money;
	}
	
	public void withdraw(int money) {
		this.money-=money;
	}
	
	public void show() {
		System.out.println("============");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌 : "+id);
		System.out.println("예금주 : "+name);
		System.out.println("금액 : "+money);
	}
}
