package test03;

public class test03_06 {
	public static void main(String[] args) {
		Landload mater=new Landload();
		mater.getMoney();
	}
}
class Rent{
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�");
	}
}
class Landload extends Rent{
	public void getMoney() {
		System.out.println("�ǹ��� �Դϴ� ");
		payment();
	}
}