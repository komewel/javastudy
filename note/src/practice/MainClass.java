package practice;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass {

	public static void main(String[] args) {
		

		JSONObject a = new JSONObject();
		a.put("성", "김");
		a.put("이름", "영환");
		a.put("성별", "남자");
		a.put("키", 150);
		JSONObject b = new JSONObject();
		b.put("성", "김");
		b.put("이름", "영환");
		b.put("성별", "남자");
		b.put("키", 150);
		JSONArray c = new JSONArray();
		c.put(a);
		c.put(b);
		System.out.println(c);
		}
	
	}

