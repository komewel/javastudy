package ex03_api;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class JSONMainClass {

	public static void ex01() {
		
		//주소 + 파라미터 + 방식
		
		
		String serviceKey = "no9daXCn4QrYaE87ayVA74+q74AnVv2gS9iMIPvJ34/MovWkyEtnD143fV1Luuy6bq7YJkKza+O+POn6IeF5PQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		HttpURLConnection con = null;
		URL url = null;
		BufferedReader reader = null;
		
		try {
			
			
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&sidoName=" + URLEncoder.encode("서울", "UTF-8"));
	
			url = new URL(sbURL.toString());
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			
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
			
			
			reader.close();
			con.disconnect();
			
			System.out.println(sb.toString());
			JSONObject obj = new JSONObject(sb.toString());
			
			//obj3 == body(체이닝)
			JSONObject body = obj.getJSONObject("response").getJSONObject("body"); 
			JSONArray items = body.getJSONArray("items");
			System.out.println(items);
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);  //get을 할때는 캐스팅을 해줘라(타입맞춰줘야함)
				String stationName = item.getString("stationName");
				String pm10Value = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				
				System.out.println(stationName + " : 미세먼지 - " + pm10Value + " : 오존농도 - " + o3Value);
			}
			int totalCount = body.getInt("totalCount");
			
			
			
		}catch (Exception e) {
			e.printStackTrace(); 
		}
				
	}
	
	public static void ex01_parse() {
		
		File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
		
		// xml 분석
		try {
			
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(file);
				
				Element root = doc.getDocumentElement();   // <response> (최상위 태그)
				System.out.println(root.getNodeName());
				
				NodeList nodeList = root.getChildNodes();  // <response>의 자식 태그(<header>, <body>)
				for(int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);          // <header>와 <body>
					System.out.println("  " + node.getNodeName());
					NodeList nodeList2 = node.getChildNodes();        // <header>의 자식 태그(<resultCode>, <resultMsg>), <body>의 자식 태그(<items>, <numOfRows>, <pageNo>, <totalCount>)
					for(int j = 0; j < nodeList2.getLength(); j++) {
						Node node2 = nodeList2.item(j);
						System.out.println("    " + node2.getNodeName());
						if(node2.getNodeName().equals("items")) {     // <items> 태그 대상
							NodeList items = node2.getChildNodes();   // <items>의 자식 태그(<item>)
							for(int k = 0; k < items.getLength(); k++) {
								Node item = items.item(k);
								System.out.println("      " + item.getNodeName());
								NodeList itemChildren = item.getChildNodes();        // <item>의 자식 태그
								for(int l = 0; l < itemChildren.getLength(); l++) {
									Node itemChild = itemChildren.item(l);
									System.out.println("        " + itemChild.getNodeName() + ":" + itemChild.getTextContent());
								}
							}
						}
					}
					
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	public static void ex02() {
		
		String serviceKey = "no9daXCn4QrYaE87ayVA74+q74AnVv2gS9iMIPvJ34/MovWkyEtnD143fV1Luuy6bq7YJkKza+O+POn6IeF5PQ==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
		HttpURLConnection con = null;
		URL url = null;
		BufferedReader reader = null;
		
		try {
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&searchDate=2023-01-30");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection)url.openConnection();
						
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			//내려받을 타입을 지정해준다. 
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			JSONObject obj = new JSONObject(sb.toString());
			JSONArray items = new JSONObject(sb.toString())
								.getJSONObject("response")
								.getJSONObject("body")
								.getJSONArray("items");
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("frcstOneDt") + " : " + item.getString("frcstOneCn"));
				System.out.println(item.getString("frcstTwoDt") + " : " + item.getString("frcstTwoCn"));
				System.out.println(item.getString("frcstThreeDt") + " : " + item.getString("frcstThreeCn"));
				System.out.println(item.getString("frcstFourDt") + " : " + item.getString("frcstFourCn"));
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex01();
		
	}

}
