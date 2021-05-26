package sub2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sub1.Apple;

/*
 * 2021/05/26
 * 김영현
 * 컬렉션 리스트 실습
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
		list1.remove(2);//지정된 리스트 삭제
		list1.add(1,3);// 지정된 리스트에 삽입 (원래 있는 숫자부터 끝까지 한자리씩 밀림)
		
		for (int num : list1)
			System.out.print(num+", ");
		System.out.println();
		
		List<String> list2=new ArrayList<String>();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		

		for (String person : list2)
			System.out.print(person+", ");
		System.out.println();
		
		List<Apple> list3=new ArrayList<>();
		list3.add(new Apple("한국",1000));
		list3.add(new Apple("중국",2000));
		list3.add(new Apple("일본",3000));
		
		Apple apple=list3.get(0);
		apple.toString();
		
		list3.get(1).toString();
		list3.get(2).toString();

	}
}
