package sub3;

public class Calc {
	
	private static Calc instance=new Calc();
	
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x,int y) {
		return x+y;
	}
	
	public int minus(int x,int y) {
		return x-y;
	}
	
	public int multi(int x,int y) {
		return x*y;
	}
	
	public int div(int x,int y) throws Exception{
		if (y==0) {
			Exception exception1=new Exception("y�� 0�� �Ǿ�� �ȵ˴ϴ�");
			throw exception1;
		}else if (y<0) {
			Exception exception2=new Exception("y�� ������ �Ǿ�� �ȵ˴ϴ�");
			throw exception2;
		}
		
		return x/y;
	}	
}
