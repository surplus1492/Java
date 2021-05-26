package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2021/05/26
 * 김영현
 * 컬렉션 집합 실습
 */

public class CollectionSetTest {
	public static void main(String[] args) {
		//set
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		
		//원소 갯수
		System.out.println("원소 갯수 "+set.size());
		
		//출력
		Iterator<Integer> iter=set.iterator();

		while(iter.hasNext())
			System.out.print(iter.next()+", ");
	}
}
