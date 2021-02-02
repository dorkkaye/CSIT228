import java.util.*;
public class TestPerson {
	public static void main(String[] args) {
      Person person = new Person();
      person.setName("John Doe");


      /*MobileNumber number[] = new MobileNumber[10];
      for (int x = 0; x<=number.length(); x++)
      	number[x] = new MobileNumber("")*/
      MobileNumber number1 = new MobileNumber();
      number1.setNumber("09001234567");
      MobileNumber number2 = new MobileNumber();
      number2.setNumber("09123456789");

      List<MobileNumber> numberList = new ArrayList<MobileNumber>();
      numberList.add(number1);
      numberList.add(number2);
	  person.setNumbers(numberList);

      System.out.println(person.getNumbers()+" are mobile numbers of the person "+
      person.getName());
   }

 }