package sub1;

public class StockAccount extends Account{

	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int money,String stock,int amount,int price) {
		super(bank, id, name, money);
		this.stock=stock;
		this.amount=amount;
		this.price=price;
	}
	
	public void sell(int amount,int price) {
		int total=amount*price;
		money +=total;
	}
	
	
	public void buy(int amount,int price) {
		int total=amount*price;
		money -=total;
	}
	
	public void show() {
		System.out.println("====================");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+money);
		System.out.println("주식종목 : "+stock);
		System.out.println("주식수량 : "+amount);
		System.out.println("주식가격 : "+price);
	}
}
