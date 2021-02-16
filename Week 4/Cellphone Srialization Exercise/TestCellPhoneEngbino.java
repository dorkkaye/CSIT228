import java.util.*;
import java.io.*;

public class TestCellPhoneEngbino 
{
    private static void menu()
    {
        System.out.println("CELLPHONE MENU");
        System.out.println("[1] Load");;
        System.out.println("[2] Call");
        System.out.println("[3] Text");
        System.out.println("[4] Battery Status");
        System.out.println("[5] Turn off Phone\n");

        System.out.print("Input choice: ");
    }

    //9. Write a main method implementing all the methods defined above.
    public static void main(String arg[]) throws ClassNotFoundException {
        CellPhone cp[];
        boolean canCall, canText;
        float duration, load = 0;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Phones: ");
        int num = sc.nextInt();
        sc.nextLine();
        cp = new CellPhone[num];

        try 
        {
            for (int i = 0; i < num; i++) 
            {
                System.out.print("Phone name: ");
                String name = sc.nextLine();
                System.out.print("Phone brand: ");
                String brand = sc.nextLine();
                System.out.print("Talktime: ");
                float talkTime = sc.nextFloat();
                System.out.print("Rate Per Minute: ");
                float ratePerMinute = sc.nextFloat();
                System.out.print("Rate Per Text: ");
                float ratePerText = sc.nextFloat();
                System.out.print("Set default load (1 - yes| any number - 0)?: "); 
                int loadChoice = sc.nextInt();
                
                if(loadChoice != 1)
                {
                    System.out.print("Load amount: ");
                    load = sc.nextFloat();
                    cp[i] = new CellPhone(name, brand, load, talkTime, ratePerMinute, ratePerText);
                }
                else
                    cp[i] = new CellPhone(name, brand, load, ratePerMinute, ratePerText);
                
                do
                {
                    System.out.println("Phone " + (i + 1) + " Details:");
                    menu();
                    choice = sc.nextInt();

                    switch (choice) 
                    {
                        case 1: System.out.print("Enter load amount: ");
                                cp[i].addLoad(sc.nextFloat());
                                break;
                        case 2:
                            System.out.print("Enter duration: ");
                            duration = sc.nextFloat();

                            canCall = cp[i].callBool(duration);

                            if (canCall)
                            {
                                System.out.println("Successfuly made a call with duration: " + duration);
                                System.out.println("Remaining Load: " + cp[i].getLoad() + "\nRemaining TalkTime: " + cp[i].getTalkTime());
                            } 
                            else
                                System.out.println("Sorry, you do not have enough load or talktime.");
                            break;
                        case 3:
                            canText = cp[i].text();
                            if (canText) 
                            {
                                System.out.println("Text sent succesfully.");
                                System.out.println("Remaining load: " + cp[i].getLoad() + "\nRemaining TalkTime: " + cp[i].getTalkTime());
                            } else
                                System.out.println("Sorry, your load balance or Talk Time.");
                            break;
                        case 4:
                            System.out.println("Battery Status: " + cp[i].getTalkTime());
                            break;
                        case 5:
                            System.out.println("Phone Shutting down");
                            break;
                    }
                }
                while(choice != 5);
            }

            //Serializing
            File file = new File("PhoneInfo.txt");
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cp);
            cp = null;
    
            //Deserializing
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
    
            cp = (CellPhone[]) objectIn.readObject();
        
            objectOut.close();
            objectIn.close();
        }
        catch (Exception e) 
        {
            System.out.println("Error");
        }

        int ctr = 1;
        for(CellPhone phone : cp) 
        {
            System.out.println("Phone " + ctr++ + ":");
            System.out.println(phone);
        }
        
        sc.close();
    }
}
