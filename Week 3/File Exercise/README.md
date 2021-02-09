1.) Write a class MyFileLastnameF1 that has the following methods:
 public boolean createFile(String filename)
 public boolean isFile(File file) //returns true if file is a file
 public boolean delete(File file) //deletes the file
 public boolean isDirectory(File file) //returns true if file is a directory
 public boolean writeToFile(String filename)
 public boolean readFromFile(String filename)

In a separate class called TestMyFileLastnameF1, write a main method that will invoke all methods of MyFileLastname. 

2.) In another file, create a class called AirlineFileLastname. Ask inputs from the user and write the input data to input.txt. Read inputs from input.txt, perform the operations needed and write the output to output.txt.
The Problem:
A small airline has just purchased a computer for its new automated reservations system. You have been asked to program the new system. You have to write a program to assign seats on each flight of the airline's only plane. ( capacity: 10 seats )
	Your program should display the following menu of alternatives -- Please type 1 for "First Class" and 2 for "Economy". If the person types 1, your program should assign a seat in the first class section (seats 1-5). If the person types 2, your program should assign a seat in the economy section (6-10). Your program should print a boarding pass indicating the person's seat number and whether it is in the first class or economy section of the plane.
 	Use single-subscripted array to represent the seating chart of the plane. Initialize the elements of the array to 0 to indicate that all seats are empty. As each seat is assigned, set the corresponding element s of the array to 1 to indicate that the seat is no longer available.
	Your program should never assign a seat that has already been assigned. When the first class section is full, your program should ask the person if it is acceptable to be placed in the non-smoking section (and vice-versa). If yes, then make the appropriate seat assignment. If no, then print the message "Next flight leaves in 3 hours....".



In the main method of this file, the following operations should be performed:
   2.1) create an instance of MyFile (filename: input.txt)
   2.2) user must enter information about a customer (refer to input list in the problem above)
   2.3) write all these information to a file (input.txt)
   2.4) perform the necessary operation (read information needed from a file from input.txt) to display the one shown above. 
   2.5) write the output (the one shown above) to another file (output.txt). 
