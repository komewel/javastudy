package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void ex01() {
		
		//배열 리스트(ArrayList) 선언 및 생성
		List<String> list = new ArrayList<String>();  //크기설정이런거 없이 지가 알아서 해줌 List고를때 인터페이스 아이콘 있는 List로 골라야한다.
				
		//추가
		list.add("summer"); //인덱스 지정이 없으면 항상 마지막에 추가됨 
		list.add("autumn"); 
		list.add("frog");
		list.add("winter"); 
		list.add(0, "spring"); //인덱스 0에 spring 추가됨
		
		//수정
		list.set(2, "fall");
		
		//삭제
		list.remove("frog"); //삭제할 대상을 전달
		list.remove(3); //삭제할 대상의 인덱스를 전달
		
		//확인
		System.out.println(list); //여기서 확인 해볼수 있는게 {} 안에는 순차적인데 괄호 밖에는 객체지향이다 순서가 상관없다.
		
	}
	
	public static void ex02() {
		
		//ArrayList 초기화
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		//리스트 길이
		System.out.println("리스트 길이 : " + list.size()); //얜 length가 아니라 size이다.
		
		//개별 요소 확인
		System.out.println("첫 번째 요소 : " + list.get(0));
		System.out.println("첫 번째 요소 : " + list.get(list.size() - 1));
		
		//리스트 순회
		//모든 요소의 합계 구하기
		int total = 0;
		for(int i = 0, length = list.size(); i < length; i++) {
			total += list.get(i); 
		}
		System.out.println("모든 요소의 합 : " + total);
		
		
	}

	public static void ex03() {
	
		List<User> userList = new ArrayList<User>();
		
		for(int i = 0; i < 3; i++) {
			
			User user = new User("user", "123456");
			userList.add(user);  //user를 끼워 넣는 과정
			System.out.println(userList.get(i));
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(userList.get(i).getId());  //위에 for문에서 이미 
		}											  //정보가 다 기입되어있기 때문에
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
