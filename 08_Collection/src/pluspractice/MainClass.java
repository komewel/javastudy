package pluspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;import javax.print.DocFlavor.STRING;

public class MainClass {
	
	public static void ex01() {
		
		List<String> list = new ArrayList<String>(); // ArrayList가 List 인터페이스안에 있기 때문에 ArrayList<String> list = new ArrayList<String>();로 안해도 된다
		
		//List<String> list = new List<>(); 못만드는 이유는 List안에 (추상)메소드는 본문이 없기때문에 아무런 역할을 못한다(추상메소드가 하나만 껴있어도 못한다)
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String season : list) {
			System.out.println(season);
		}
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int n : arr) {
		}
		System.out.println(Arrays.toString(arr));
	
		
	}

	public static void ex02() {
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(90, "제시카");
		treemap.put(100, "블랑카");
		treemap.put(50, "제레미");
		treemap.put(80, "사만다");
		
		System.out.println(treemap);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(10, "b");
		map.put(101, "c");
		map.put(11, "d");
		
		System.out.println(map);
		
	}
	
	public static void ex03() {
		
		String name = "제시카";
		String phone = "010-1111-2222";
		int age = 20;
		
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("phone", phone);
		map.put("age", age + "");
		
		System.out.println(map);
		
	}
	
	public static void ex04() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("serviceKey", "asdsad");
		map.put("Content-Type", "application/xml");
		
		
		ex05(map);
		
		
		
		
	}
	
	public static void ex05(Map<String, Object> map) {
		
		Set<Entry<String, Object>> set = map.entrySet();
		for(Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());  //여러가지 데이터를 하나로 모아서 하는방법이 객체화나 맵을 쓴다
		}
		
	}
	
	public static void main(String[] args) {
		ex04();

	
}
}