/*Problem: Test Person
** @Author: Leah V. Barbaso
** @Date: Dec 11, 2019
*/
import java.io.*;
public class Person implements Serializable{
	private transient String idnum;
	private String name;
	private transient int age;
	private String gender;

	public Person(String idnum, String name, int age, String gender){
		this.idnum = idnum;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getIDNumber(){
		return idnum;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getGender(){
		return gender;
	}

	public String toString(){
		return "ID Number : " + getIDNumber() + "\nName : " + getName() +"\n" + getAge() + "\n" + getGender();
	}

	public boolean equals(Object obj){
		if(obj instanceof Person){
			Person p = (Person) obj;
			if(this.getName() == p.getName())
				return true;
			else
				return false;
		}
		else
			return false;
	}
}