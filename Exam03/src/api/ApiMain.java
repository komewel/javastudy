package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		
		File file = new File("accident.txt");
		String serviceKey = "no9daXCn4QrYaE87ayVA74+q74AnVv2gS9iMIPvJ34/MovWkyEtnD143fV1Luuy6bq7YJkKza+O+POn6IeF5PQ==";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		HttpURLConnection con = null;
		URL url = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {			
						
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?ServiceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&type=json");
			sbURL.append("&siDo=1100");
			sbURL.append("&guGun=1125");
			sbURL.append("&searchYear=2021");
			sbURL.append("&type=json");
			sbURL.append("&occrrnc_dt=2019011622");
			sbURL.append("&occrrnc_day_cd=4");
			sbURL.append("&dth_dnv_cnt=0");
			sbURL.append("&injpsn_cnt=1");
			sbURL.append("&numOfRows=10");
			sbURL.append("&pageNo=1");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
				
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			JSONObject obj = new JSONObject(sb.toString());
			JSONArray item = obj.getJSONObject("items").getJSONArray("item");
			writer = new BufferedWriter(new FileWriter(file));
			List<Accident> ar = new ArrayList<>();
			for(int i = 0; i < item.length(); i++) {
				JSONObject a = item.getJSONObject(i);  
				String occrrncDt = a.getString("occrrnc_dt");
				String occrrncDayCd = a.getString("occrrnc_day_cd");
				int dthDnvCnt = a.getInt("dth_dnv_cnt");
				int injpsnCnt = a.getInt("injpsn_cnt");
				switch(occrrncDayCd) {
				case "1" : occrrncDayCd = "일"; break;
 				case "2" : occrrncDayCd = "월"; break;
				case "3" : occrrncDayCd = "화"; break;
				case "4" : occrrncDayCd = "수"; break;
				case "5" : occrrncDayCd = "목"; break;
				case "6" : occrrncDayCd = "금"; break;
				default : occrrncDayCd = "토"; 
				}
				Accident accident = new Accident(occrrncDt, occrrncDayCd, dthDnvCnt, injpsnCnt);
				ar.add(accident);
				
				
				writer.write("발생일자 " + occrrncDt + " " + occrrncDayCd + ", 사망자수" + dthDnvCnt + "명, 부상자수 " +injpsnCnt + "명");
			
			}			
			
			reader.close();
			con.disconnect();
			
			
		}catch (Exception e) {
			e.printStackTrace(); 
		}
	}

}
