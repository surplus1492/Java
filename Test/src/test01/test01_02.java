package test01;

import java.util.Scanner;

public class test01_02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int input;
		System.out.print("input �� �Է� : ");
		
		input=scanner.nextInt();
		int result=(1+2)*input;
		
		System.out.println("(1+2)*input = "+result);
		
		String name;
		System.out.print("name : ");
		name=scanner.next();
		String hello="�ȳ�! "+name+"�� �ݰ����ϴ�";
		System.out.println(hello);
	}
}
