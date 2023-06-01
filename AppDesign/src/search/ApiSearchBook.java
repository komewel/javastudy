package search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ApiSearchBook {

	public static void main(String[] args) throws Exception {
		
		
		String clientId = "egW8bx2wwy37XghWgXiv";
		String clientSecret = "JxfuH5EGgs";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어를 입력하세요 >>> ");
		String query = sc.nextLine();
		
		String apiURL = "https://openapi.naver.com/v1/search/book.json?query=" + URLEncoder.encode(query, "UTF-8");
		URL url = new URL(apiURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", clientId);
		conn.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	
		BufferedReader br = null;
		if(conn.getResponseCode() == 200) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		
		StringBuilder sb = new StringBuilder();
		String line = null;
		while((line = br.readLine()) != null) {
			sb.append(line);
		}
		
		br.close();
		
		/*
		JSONObject jsb = new JSONObject(sb);
		String link = jsb.getString("link");
		*/
		
		try {
		 File dir1 = new File("C: " + File.separator + "download");	
		 File file = new File(dir1, query + ".html");
		 if(file.exists() == false) {
			 file.createNewFile();
		 }
		 BufferedWriter bw1 = new BufferedWriter(new FileWriter(file));
		 bw1.write(sb.toString());
			 
		 }catch (Exception e) {
			 LocalDateTime now = LocalDateTime.now();
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			 String dateTime = dtf.format(now);
			 
			 String message = e.getMessage();
			 
			 File dir2 = new File("C:" + File.separator + "download" + File.separator + "log");
			 if(dir2.exists() == false) {
				 dir2.mkdirs();
			 }
			 File file2 = new File(dir2, "error_log.txt");
					 
			 try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2, true))) {
				 	bw2.write("\n"+ "예외메시지" + " " + message + "\n" + "예외발생시간" + " " + dateTime);
				 	System.out.println("예외 메시지가 error_log.txt 파일에 기록되었습니다.");
				 	
			 }catch (Exception e2) {
				 e2.printStackTrace();
			 }
		 }
	 
	}

}
