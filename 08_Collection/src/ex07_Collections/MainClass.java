package ex07_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	public static void printlist(List<Integer> list) {
		
		int LastIndex = list.size() - 1;
		
		for(int i = 0; i <LastIndex; i++) {
			System.out.print(list.get(i) + "→");
		}
		System.out.println(list.get(LastIndex));
		
	}
	
	

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 2, 3, 1, 4);
	
		printlist(list);
		
		Collections.sort(list);  //오름차순 정렬
		
		printlist(list);
		
		int idx = Collections.binarySearch(list, 1); //이진검색(반드시 정렬이 되어 있어야 한다.), 찾는값이 없을때 못찾을때는 마이너스(-) 값이 나온다
		if(idx >= 0) {
			System.out.println("찾았다.");
		} else {
			System.out.println("못 찾았다.");
		}
	}

}
