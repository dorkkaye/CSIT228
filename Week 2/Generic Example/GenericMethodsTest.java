public class GenericMethodsTest {
   //prints the elements of the array
   public static < E > void printArray(E[] inputArray) {
      for(E element : inputArray)
         System.out.printf("%s \n", element);
   }

   public static <E> void sortArray(E[] inputArray){
	   //code for sorting elements
   }

   public static void main(String args[]) {
      Integer[] intArr = { 1, 2, 3, 4, 5 };
      Double[] doubleArr = { 5.1, 5.2, 2.3, 1.4 };
      Character[] charArr = { 'C', 'I', 'T', 'U'};
      String[] strArr = {"This","is","a string."};
	  int[] intArr1 = { 12, 12, 13, 14, 15 };
	  Person p[] = new Person[2];

	  for (int x = 0; x<p.length; x++)
	  	p[x] = new Person();

      System.out.println("Integer Array contains:");
	  printArray(intArr);		//calls printArray method
	  System.out.println("Double Array contains");
      printArray(doubleArr);
      System.out.println("Character array contains");
      printArray(charArr);
      System.out.println("String Array contains:");
      printArray(strArr);
      System.out.println("Object array contains:");
      printArray(p);

   }
}