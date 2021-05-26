package sub2;

import java.util.Iterator;

/*
 * 2021/05/25
 * �迵��
 * ����ó�� �ǽ�
 */

public class ExceptionsTest {
	public static void main(String[] args) {
		
		//�迭 �ε��� ���� ����
		int arr[]=new int[3];
		
		for (int i = 0; i <= 3; i++) {
			try {
				arr[i]=i+1;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i:arr) {
			System.out.println("arr : "+i);
		}
		
		//NullPointer ����
		try {
			Tiger tiger=null;
			
			tiger.move();
			tiger.hunt();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//Casting
		try {
			Animal a1=new Eagle();
			Animal a2=new Shark();
			
			Eagle eagle=(Eagle) a1;
			Shark shark=(Shark) a1;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("���α׷� ����");
	}
}
