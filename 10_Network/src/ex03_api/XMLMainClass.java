package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class XMLMainClass {
	
	public static void ex01() {
		
		
		/*
		한국공항공사_항공기 운항정보 : 공항 코드 정보 
		1. 서비스URL : "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList"
		2. 요청변수(Request Parameter)
			1) Servicekey : 인증키
		*/
		
		/*방법1
		String encodingKey = "no9daXCn4QrYaE87ayVA74%2Bq74AnVv2gS9iMIPvJ34%2FMovWkyEtnD143fV1Luuy6bq7YJkKza%2BO%2BPOn6IeF5PQ%3D%3D";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		apiURL += "?serviceKey=" + encodingKey;
		 */
		
		
		//방법2(추천)
		String serviceKey = "no9daXCn4QrYaE87ayVA74+q74AnVv2gS9iMIPvJ34/MovWkyEtnD143fV1Luuy6bq7YJkKza+O+POn6IeF5PQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");  //? 뒤에 붙여서 요청하는 방식은 다 GET
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8"); //xml문서의 데이터타입
			
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
			
			File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("공항코드정보.xml이 생성되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ex02() {
		
		/*
		한국공항공사_항공기 운항정보 : 국제선 운항 스케쥴
		1. 서비스URL : "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList"
		2. 요청변수(Request Parameter)
			1) Servicekey : 인증키
			2) pageNo : 조회할 페이지번호
			3) schDate : 검색일자
			4) schDeptCityCode : 출발도시코드
			4) schArrvCityCode : 도착도시코드
		*/
		
		String serviceKey = "no9daXCn4QrYaE87ayVA74+q74AnVv2gS9iMIPvJ34/MovWkyEtnD143fV1Luuy6bq7YJkKza+O+POn6IeF5PQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		URL url = null;
		HttpURLConnection con = null;
				
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20230201";
			apiURL += "&schDeptCityCode=ICN";
			apiURL += "&schArrvCityCode=JFK";
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
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
			
			File file = new File("C:" + File.separator + "storage", "국제선 운항 스케쥴.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("국제선 운항 스케쥴.xml이 생성되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ex02();
				
		
		
		
	}

}
