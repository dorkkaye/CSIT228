import java.io.*;
import java.util.*;

public class AirlineFileEngbino 
{
    static Scanner sc = new Scanner(System.in);

    static void initSeats(int seats[], int size)
    {
        int i;
        
        //First Class
        for(i = 0; i < size / 2; i++)
            seats[i] = 0;
            
        //Economy
        for(i = size / 2; i < size; i++)
            seats[i] = 0;
    }

    static void displaySeats(int seats[], int size)
    {
        int i;
        
        System.out.printf("First Class Section: ");
        //First Class
        for(i = 0; i < 5; i++)
            System.out.printf("[%d] ", seats[i]);
        
        System.out.printf("\nEconomy Section:     ");	
        //Economy
        for(i = 5; i < 10; i++)
            System.out.printf("[%d] ", seats[i]);
    }

    static void assignSeat(int st[], int seatType)
    {
        int size = 10;
        
        //First Class Section
        if(seatType == 1)	
        {
            int seat = assignFirstClass(st, size);

            if(seat == -1)
            {
                System.out.printf("\nAll seats are already taken, do you wish to be assigned in economy section (1 - yes | 0 - no): ");
                int choice = sc.nextInt();

                if(choice == 1)
                    seat = assignEconomy(st, size);
                else
                {
                    System.out.printf("\n\nAll seats are already taken.\n");
                    System.out.printf("Next flight is in 3 hours");
                    System.exit(0);
                }
            }
        }	
        //Economy Section
        if(seatType == 2)
        {
            int seat = assignEconomy(st, size);
            if(seat == -1)
            {
                System.out.printf("\nAll seats are already taken, do you wish to be assigned in first class section (1 - yes | 0 - no): ");
                int choice = sc.nextInt();

                if(choice == 1)
                {
                    seat = assignFirstClass(st, size);
                }
                else
                {
                    System.out.printf("\n\nAll seats are already taken.\n");
                    System.out.printf("Next flight is in 3 hours.");
                    System.exit(0);
                }
            }
        }	 	

        int seat;
        if(seat != -1)
        {
            displayBoardingPass(seat);
            displaySeats(st, 10);
        } else {
            System.out.printf("\n\nAll seats are already taken.\n");
            System.out.printf("Next flight is in 3 hours.");
            System.exit(0);
        }
    }

    public static int assignFirstClass(int[] seats, int size) {
        size = 10;

        for (int i = 0; i < size / 2; i++) {
            if (seats[i] != 1) {
                seats[i] = 1;
                return i;
            }
        }

        return -1;
    }

    public static int assignEconomy(int[] seats, int size) {
        size = 10;

        for (int i = size / 2; i < size; i++) {
            if (seats[i] != 1) {
                seats[i] = 1;
                return i;
            }
        }

        return -1;
    }

    public static String displayBoardingPass(int seat) {
        String boardPass = "Boarding Pass\n";
        seat = 0;
        if(seat < 5){
            boardPass += "First Class";
            System.out.println("First Class");
        }else{
            boardPass += "Economy";
            System.out.println("Economy");
        }
        System.out.println("Seat No. "+(seat+1)+"\n");
        boardPass+="\nSeat No. "+(seat+1)+"\n\n";
        seat++;

        return boardPass;
    }

    public static void main(String[] args)throws Exception
    {
        MyFileEngbinoF1 myfile = new MyFileEngbinoF1();

        int seats[] = new int[10];
        int seatType, x = 1;
        
        initSeats(seats, 10);

        while(x == 1)
        {
            displaySeats(seats, 10);
            System.out.printf("\n\nPlease type 1 for first class");
            System.out.printf("\nPlease type 2 for economy: ");
            seatType = sc.nextInt();
            assignSeat(seats, seatType);
        }
	}

	public Object seats;
}