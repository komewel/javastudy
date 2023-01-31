package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {
		
		String apiURL = "https://ssl.pstatic.net/melona/libs/1433/1433141/6b52e651087844aa8f38_20230130100433157.jpg";
		URL url = null;
		HttpURLConnection con = null;
		File file = null;
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			int responseCode = con.getResponseCode();
			String tok = null;
			
			if(responseCode == HttpURLConnection.HTTP_OK) {
				in = new BufferedInputStream(con.getInputStream());
				file = new File("C:" + File.separator + "storage",  )
			}
		}
		
		
	}
	
}
	