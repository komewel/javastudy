package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {
		
		String apiURL = "https://ssl.gstatic.com/ui/v1/icons/mail/rfr/logo_gmail_lockup_default_1x_r5.png";
		URL url = null;
		HttpURLConnection con = null;
		
		File file = null;
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			int responseCode = con.getResponseCode();
			String message = null;
			
			if(responseCode == HttpURLConnection.HTTP_OK) {
				in = new BufferedInputStream(con.getInputStream());
				file = new File("C:" + File.separator + "GDJ_61_HOME", "photo.png");
				message = "성공";
			}else {
				in = new BufferedInputStream(con.getErrorStream());
				file = new File("C:" + File.separator + "GDJ_61_HOME", "다운로드 실패.html");
				message = "실패";
			}
			
			byte[] b = new byte[10];
			int readByte = 0;
			
			while((readByte = in.read(b)) != -1) {
				out.write(b, 0, readByte);
			}
			in.close();
			out.close();
			con.disconnect();
			
			System.out.println(message);
		}catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
	