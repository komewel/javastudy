package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void ex02_complete() {
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		
		StringBuilder sb = new StringBuilder();
		String line = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb.toString());
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	