import java.util.*;
public class MyCollectionDemo{

	public static void main(String[] args){
		/*
		//--------LIST--------//
		List<Integer> mylist1 = new ArrayList();
		//add 4 elements to the list
		mylist1.add(1);
		mylist1.add(5);
		mylist1.add(3);
		mylist1.add(1);
		System.out.println(mylist1);

		//remove an element from the list at index 1
		mylist1.remove(1);
		System.out.println(mylist1);
		//remove the element 1 from the list
		boolean b = mylist1.remove((Integer)1);

		//printing the elements of the list
		for (Integer i: mylist1)
			System.out.println(i);

		System.out.println("sorting...");
		Collections.sort(mylist1);

		for (Integer i: mylist1)
			System.out.println(i);
		*/


		//-------------ARRAY LIST--------------//
		ArrayList<String> myArrayList = new ArrayList<String>();

		//adds items to the array list
		myArrayList.add("World");
		myArrayList.add("Hello");
		myArrayList.add("Hi");

		System.out.println(myArrayList);

		for (String i: myArrayList)
			System.out.print(i + " ");

		System.out.println("\nsorting...");
		Collections.sort(myArrayList);

		for (String i: myArrayList)
			System.out.print(i + " ");

		//prints the element at index 2
		System.out.println(myArrayList.get(2));

		//removes the element at index 2
		myArrayList.remove(2);
		System.out.println(myArrayList);

		//prints the number of elements of the array list
		System.out.println(myArrayList.size());

		/*
		//-------------VECTOR--------------//
		Vector<String> myVector1 = new Vector<String>();
		//Vector<Integer> myVector2 = new Vector<Integer>();
		//Vector<Person> myVector3 = new Vector<Person>();

		//adds items to the vector
		myVector1.add("Hello");
		myVector1.add("Hi");
		myVector1.add("World");
		System.out.println(myVector1);

		//removes item from the vector
		myVector1.remove(2);
		System.out.println(myVector1);

		//checks if myVector1 is empty
		System.out.println(myVector1.isEmpty());

		System.out.println(myVector1.get(1));*/

	}
}