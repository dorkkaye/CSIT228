/*Problem: Test Person
** @Author: Leah V. Barbaso
** @Date: Dec 11, 2019
*/
import java.io.*;
public class TestPerson{
	public static void main(String[] args)throws Exception{
		Person p[] = new Person[2];

		try{
			p[0] = new Person("S-121", "Jane ", 26, "Female");
			p[1] = new Person("S-221", "Peter", 28, "Male");

			//serialization
			File personFile = new File("PersonData.txt");
			FileOutputStream fileOutput = new FileOutputStream(personFile);
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(p);
			p = null;

			//de-serialization
			FileInputStream fileInput = new FileInputStream(personFile);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);

			p = (Person[]) objectInputStream.readObject();

		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		//printing the elements of Person p
		for (Person person : p)
		     System.out.println(person);

	}
}