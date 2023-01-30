package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		

		File file = new File("C:" + File.separator + "storage", "ex888.dat");
		ObjectOutputStream a = null;
		
		try {
			a = new ObjectOutputStream(new FileOutputStream(file));
			
			List<Person> b = Arrays.asList(
					new Person("김영환", 55, 1515, true),
					new Person("김김김", 85, 1815, true)
					
			);
			
			Person person = new Person();
			person.setAge(58);
			person.setName("여영영");
			person.setAlive(false);
			person.setHeight(856);
			
			a.writeObject(b);
			a.writeObject(person);
			
			System.out.println(person.toString());
			System.out.println(b.get(0));
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	
}
	