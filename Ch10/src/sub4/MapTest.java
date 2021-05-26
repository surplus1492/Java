package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 2021/05/26
 * 김영현
 * 컬렉션 맵 실습
 */

public class MapTest {
	public static void main(String[] args) {
		//Map
		Map<Integer, String> map=new HashMap<>();
		
		map.put(101, "김유신");
		map.put(102, "김춘추");
		map.put(103, "장보고");
		map.put(104, "강감찬");
		map.put(105, "이순신");
		
		System.out.println(map.size());
		
		System.out.println("101 데이터 :"+map.get(101));
		System.out.println("101 데이터 :"+map.get(103));
		System.out.println("101 데이터 :"+map.get(105));
		
		//응용
		List<Map> list=new ArrayList<>();
		
		Map<Integer, Apple>m1=new HashMap<>();
		m1.put(101, new Apple("한국",3000));
		m1.put(102, new Apple("중국",2000));
		m1.put(103, new Apple("일본",1000));
		

		Map<Integer, Apple>m2=new HashMap<>();
		m2.put(201, new Apple("미국",3000));
		m2.put(202, new Apple("영국",2000));
		m2.put(203, new Apple("호주",1000));
		

		Map<Integer, Apple>m3=new HashMap<>();
		m3.put(301, new Apple("태국",3000));
		m3.put(302, new Apple("대만",2000));
		m3.put(303, new Apple("홍콩",1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Map<Integer, Apple> map1=list.get(0);
		Apple apple=map1.get(101);
		apple.toString();
		
		list.get(1).get(302).toString();
	}
}
