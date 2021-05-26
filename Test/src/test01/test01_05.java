package test01;

public class test01_05 {
	public static void main(String[] args) {
		int num=0;
		int result;
		
		result=num++;
		System.out.println("result : "+result);
		
		result=++num;
		System.out.println("result : "+result);
		
		result=num--;
		System.out.println("result : "+result);
		
		result=--num;
		System.out.println("result : "+result);
	}
}
