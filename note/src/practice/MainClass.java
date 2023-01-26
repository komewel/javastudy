package practice;

import java.io.File;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass {

	public static void main(String[] args) {
		

		JSONObject a = new JSONObject();
		a.put("model", "세탁기");
		a.put("maker", "삼성");
		a.put("price", 100);
		JSONObject b = new JSONObject();
		b.put("model", "세탁기");
		b.put("maker", "삼성");
		b.put("price", 100);
		JSONObject d = new JSONObject();
		d.put("model", "세탁기");
		d.put("maker", "삼성");
		d.put("price", 100);
		
		JSONArray c = new JSONArray();
		c.put(a);
		c.put(b);
		c.put(d);
		
		System.out.println(c.toString());
		
		
		
		}
	}

