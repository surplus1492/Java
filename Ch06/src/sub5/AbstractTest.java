package sub5;

/*
 * 2021/05/25
 * �迵��
 * �߻�Ŭ���� �ǽ�
 */

public class AbstractTest {

	public static void main(String[] args) {
		
		Unit marin=new Marin();
		Unit zealot=new Zealot();
		Unit zergling=new Zergling();
		
		marin.move();
		zealot.move();
		zergling.move();
		
		marin.attack();
		zealot.attack();
		zergling.attack();
	}
}
