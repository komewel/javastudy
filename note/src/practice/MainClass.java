package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {
		

		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection huc = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		File file = new File("C:" + File.separator + "storage", "daum2.png");
		
		try {
			url = new URL(apiURL);
			huc = (HttpURLConnection)url.openConnection();
			
			int code = huc.getResponseCode();
			if(code == HttpURLConnection.HTTP_OK) {
				
				bis = new BufferedInputStream(huc.getInputStream());
				bos = new BufferedOutputStream(new FileOutputStream(file));
				
				byte[] b = new byte[10];
				int readbyte = 0;
				while((readbyte = bis.read(b)) != -1) {
					bos.write(b, 0, readbyte);
				}
			}
		}catch (MalformedURLException e) {
			System.out.println("주소 오류");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
	