//In a separate class called TestMyFileLastnameF1, write a main method that will invoke all methods of MyFileLastname. 

import java.io.*;
import java.util.*;

public class TestMyFileEngbinoF1 
{
    public static void main(String[] args) throws Exception
    {
        MyFileEngbinoF1 file = new MyFileEngbinoF1();
        MyFileEngbinoF1 myfile = new MyFileEngbinoF1();

        File mydir = new File("Directory");	
		mydir.mkdir();	
        File toDelete = new File("Directory");	
		toDelete.mkdir();	
        
        //Testing if everthing works
        file.createFile("Just.txt");
        file.createFile("Some.txt");
        file.createFile("Test.txt");
        file.createFile("Cases.txt");
        file.isFile(mydir);
        file.delete(toDelete);
        file.isDirectory(mydir); 
        file.writeToFile("Test.txt", null);
        file.readFromFile("Test.txt");

        
        Scanner sc = new Scanner(System.in);
        AirlineFileEngbino  airline = new AirlineFileEngbino ();
        boolean exit = false;
        int choice, seatType = 0, seat = 0;
        int seats[] = new int[10];
        int st[] = new int[10];
        boolean success;
        String filename;

        while(!exit)
        {
            System.out.println("1. Write Inputs to File(input.txt)");
            System.out.println("2. Read contents from File(input.txt or output.txt)");
            System.out.println("3. Generate Output to File(output.txt)");
            System.out.println("Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    myfile.createFile("input.txt");
                    System.out.println("Input 10 Numbers: ");
                    String seatStr = "";

                    for(int i = 0; i < 10; i++)
                    {
                        seats[i] = sc.nextInt();
                        AirlineFileEngbino.assignSeat(seats, seatType);
                        seatStr+= seats+" ";
                        
                    }
                    success = myfile.writeToFile("input.txt",seatStr);

                    if(success)
                        System.out.println("Write successful");
                    else
                        System.out.println("Failed to write file from file (input.txt)");
                    break;
                case 2:
                    myfile.createFile("output.txt");
                    System.out.println("Enter filename: ");
                    filename = sc.next();
                    
                    if(filename.equals("input.txt") || filename.equals("output.txt"))
                    {
                        success = myfile.readFromFile(filename);
                        if(success)
                            System.out.println("Read successful\n");
                        else
                            System.out.println("Failed to read from file: "+filename);
                    }
                    else
                        System.out.println("Invalid filename\n");
                    break;
                case 3:
                    String output = "";

                    for(int i =0; i < 10;i++)
                    {
                        if(airline.assignSeat(st, seatType) == 1)
                            output += AirlineFileEngbino.displayBoardingPass(seat);
                    }
                    success = myfile.writeToFile("output.txt",output);
                    if(success){
                        System.out.println("Write successful\n");
                    }else{
                        System.out.println("Failed to write file to file(output.txt)\n");
                    }
                    break;
                case 4:
                    exit = true;
                    break;

            }
        }
    }
}