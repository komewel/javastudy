package ex03_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
	
	public static void ex01() {
		
		/*
		 	Set
		 	1. 저장된 요소들의 인덱스가 없다. -> 저장 순서가 없다(뒤죽박죽이다)
		 	2. 중복 저장이 되지 않는다.(동일한 데이터는 한번만 저장된다.)
		 */
		
		// HashSet 객체 선언 및 생성 
		Set<String> set = new HashSet<String>();
		
		//추가
		set.add("spring");
		set.add("spring"); //중복되어있으므로 하나만 저장
		set.add("spring");
		set.add("summer");
		set.add("autumn");
		set.add("winter");
		
		//제거
		set.remove("winter");
		
		//확인
		System.out.println(set);
		
		
	}

	public static void ex02() {
		
		//HashSet 객체의 초기화(List를 이용해서 초기화를 진행)
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		//인덱스가 없기 때문에 향상 for문만가능
		for(Integer n : set) {
			System.out.println(n);
		}
	}
	

	
	public static void ex03() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		//교집합
		set1.retainAll(set2);    //set1에 교집합 결과가 저장된다.
		
		System.out.println(set1); //값이 set1 자체가 변함
		System.out.println(set2);
		
	}
	
	public static void ex04() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		//합집합
		set1.addAll(set2);    //set1에 교집합 결과가 저장된다.
		
		System.out.println(set1); //값이 set1 자체가 변함
		System.out.println(set2);
		
	}
	
	public static void ex05() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		//차집합
		set1.removeAll(set2);    //set1에 교집합 결과가 저장된다.
		
		System.out.println(set1); //값이 set1 자체가 변함
		System.out.println(set2);
	}
	
	public static void ex06() {
		
	
		Set<Integer> lotto = new HashSet<Integer>();
		
		// 1 ~ 45 : 6개 랜덤으로 발생
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
	System.out.println(lotto);
	}
	
	public static void main(String[] args) {

		ex06();
	}

}
