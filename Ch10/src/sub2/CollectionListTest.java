package sub2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sub1.Apple;

/*
 * 2021/05/26
 * �迵��
 * �÷��� ����Ʈ �ǽ�
 */

public class CollectionListTest {
	public static void main(String[] args) {
		//List
		List<Integer> list1=new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);//������ ����Ʈ ����
		list1.add(1,3);// ������ ����Ʈ�� ���� (���� �ִ� ���ں��� ������ ���ڸ��� �и�)
		
		for (int num : list1)
			System.out.print(num+", ");
		System.out.println();
		
		List<String> list2=new ArrayList<String>();
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		

		for (String person : list2)
			System.out.print(person+", ");
		System.out.println();
		
		List<Apple> list3=new ArrayList<>();
		list3.add(new Apple("�ѱ�",1000));
		list3.add(new Apple("�߱�",2000));
		list3.add(new Apple("�Ϻ�",3000));
		
		Apple apple=list3.get(0);
		apple.toString();
		
		list3.get(1).toString();
		list3.get(2).toString();

	}
}
