package ex05_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
								/*	
								 	 Map은 객체를 대신해서 사용할수있다.
									 HashMap
									 1. 하나의 데이터(Entry)가 2개의 요소로 구성된다. 
									 2. 용어 정리
										1) Entry : 하나의 데이터
										2) Key 	 : Entry(단위)의 구성 요소, 식별자 역할을 수행(배열의 인덱스와 같은 역할을 수행한다)
										3) Value : Entry(단위)의 구성 요소, 실제 데이터(배열에 저장된 데이터와 같은 역할) 
									 3. 주로 Key는 String을 사용한다. (변수이름)
									 4. 주로 Value는 Object를 사용한다. (변수의 저장된 값)
									 5. Key는 중복이 불가능하고(변수이름이 두개일수는 없는것처럼, 얘때문에 hash개념이 도입된거다), Value는 중복이 가능하다.
								 */
								
	
	public static void ex01() {    //Entry가 두개로 구성된 Map
		
		//Person 정보를 HashMap으로 만들기
		Map<String, Object> person = new HashMap<>(); //generic 마냥 이것도 생략 가능 //동일한걸 빠르게 찾기위해서 hash라는 개념을 도입한거다
		
		//추가
		//put(Key, Value)메소드역할임
		person.put("name", "홍길동");
		person.put("age", 30);   //원래는 타입을 따로 정해줘야 하는데 수고를 덜수 있음
		
		//수정
		//put(Key, Value)
		person.put("age", 40); //같은이름이 생기면 오류가 나는게 아니라 수정이 됨 위에있는person.put("age", 30);이게 수정된거
							   //기존 Key와 동일한 Key를 전달하면 해당 Key값의 Value가 수정된다.
		
		//삭제
		//remove(Key)
		int age = (int)person.remove("age"); //이러면 age가 40이란 값을 반환하는데 이건 타입이 Object이다.절대 int타입이나 String타입이 아니다.
							  				 //선생님설명: 삭제된 Value가 반환된다. Value는 Object 타입이므로 캐스팅해야 사용할 수 있다.
		System.out.println("삭제된 나이 : " + age);
		//확인
		System.out.println(person);
	}

	public static void ex02() {
		
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("spring", "봄");
		dictionary.put("summer", "여름");
		dictionary.put("autumn", "가을");
		dictionary.put("winter", "겨울");
		
		//Value 가져오기
		//get(Key) 
		String season = dictionary.get("winter");
		System.out.println(season);
		
	}
	
	public static void ex03() {    //for문 돌리기
		
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("spring", "봄");
		dictionary.put("summer", "여름");
		dictionary.put("autumn", "가을");
		dictionary.put("winter", "겨울");
		
		//Map 순회하기
		
		//1. Key만 모두 가져온 뒤, 해당 Key값을 가진 Value를 가져오기
		Set<String> keySet = dictionary.keySet();
		for(String key : keySet) {
			System.out.println(key + ":" + dictionary.get(key)); //dictionary.get(key) Value값임
		}
		
		//2. Entry를 모두 가져온 뒤, Key와 Value로 분리하기
		for(Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public static void ex04() {
		
		//제목(title), 저자(author), 가격(price)으로 구성되는 책(book) : HashMap
		Map<String, Object> book1 = new HashMap<>();
		book1.put("title", "어린왕자");
		book1.put("author", "생텍쥐베리");
		book1.put("price", 10000);
		
		Map<String, Object> book2 = new HashMap<>();
		book2.put("title", "성냥팔이소녀");
		book2.put("author", "안데르센");
		book2.put("price", 20000);
		
		Map<String, Object> book3 = new HashMap<>();
		book3.put("title", "소나기");
		book3.put("author", "황순원");
		book3.put("price", 30000);
		
		//책(book) 3권이 저장된 ArrayList
		List<Map<String, Object>> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		//for문 순회
		
		//List의 순회
		for(int i = 0, length = books.size(); i < length; i++) {
			//Map의 순회(List에 저장된 요소가 Map이다.)
			Map<String, Object> book = books.get(i);
			System.out.println((i + 1) + "번째 책의 정보");
			for(Entry<String, Object> entry : book.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		ex04(); 
	}

}
