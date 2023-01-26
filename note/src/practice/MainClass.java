package practice;

import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONPointer;

public class MainClass {

	public static void main(String[] args) {

		JSONObject a = new JSONObject();
		a.put("지역", "경기도");
		a.put("수도", "서울");
		
		JSONArray b = new JSONArray();
		b.put(a);
		 
	
		System.out.println(b.toString());
		}
	}

