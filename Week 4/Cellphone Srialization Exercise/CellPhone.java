import java.io.*;
import java.util.*;

//Define a class CellPhone implementing the abstract class Phone
public class CellPhone extends Phone implements Serializable 
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // 3 data members
    private float load;
    /*
        NOTE: talkTime - number of minutes you can call and text without
              draining your battery.
    */
    private float talkTime; 
    private float ratePerMinute;
    
    private float ratePerText;

    CellPhone(){}

    //2. provide a constructor that would initialize all the attributes 
    CellPhone(String name, String brand, float load, float talkTime, float ratePerMinute, float ratePerText)
    {
        super(name, brand);
        this.load = load;
        this.talkTime = talkTime;
        this.ratePerMinute = ratePerMinute;
        this.ratePerText = ratePerText;
    }

    /*
        3. override the first constructor, allow the user to initialize all 
           the attributes except the load, instead, directly set load to 300. 
    */
    CellPhone(String name, String brand, float load, float ratePerMinute, float ratePerText)
    {
        super(name, brand);
        this.setLoad(300);;
        this.ratePerMinute = ratePerMinute;
        this.ratePerMinute = ratePerMinute;
    }

    //1. Define getter 
    public void setLoad(float load) { this.load = load; }
    public void setTalkTime(float talkTime) { this.talkTime = talkTime; }
    public void setRatePerMinute(float ratePerMinute) { this.ratePerMinute = ratePerMinute; }
    public void setRatePerText(float ratePerText) { this.ratePerText = ratePerText;}

    //setter methods
    public float getLoad() { return load; }
    public float getTalkTime() { return talkTime; }
    public float getRatePerMinute() { return ratePerMinute; }
    public float getRatePerText() { return ratePerText; }

    /*
        4. implement this method:
           HINT: you will use the ratePerMinute here. The duration is per min.
    */
    public float callCost(float duration)
    {
        return duration * ratePerMinute;
    }

    /*
        5. implement the call method: you are allowed to call if the duration 
           is less than or equal to the available talkTime and you have enough
           load to complete the call. 
           
        NOTE: you have to call callCost method and don’t forget to deduct the 
              talkTime 
    */
    float callFloat(float duration)
    {
        callBool(duration);    //Check if call is possible

        this.talkTime -= duration;

        return callCost(duration);
    }

    boolean callBool(float duration)
    {
        return (duration <= this.talkTime) && 
                (this.load >= callCost(duration));
    }

    /*
        6. & 7. implement all other methods needed for this class not to 
        encounter compile time error.
    */
    public boolean isLowBat()   //returns true if the talkTime is equal to zero.
    {
        return this.talkTime == 0;
    }

    public boolean text()   
    {
        if(this.load >= this.ratePerText)
        {
            this.load -= this.ratePerText;  //reduces the load by its ratePerText
            this.talkTime -= 0.05;  //it consumes 0.05 minute of the talkTime

            return true;    //returns true if text is successfully sent
        }
        
        return false;
    }

    public float addLoad(float amount)
    {
        return load += amount;
    }

    //8. override the toString method.
    public String toString()
    {
        return "Load: " + this.load +
             "\nTalk Time: " + this.talkTime +
             "\nRate Per Minute: " + this.ratePerMinute +
             "\nRate Per Text: " + this.ratePerText;
    }

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
        sc.nextLine();

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
                System.out.print("Set default load (1 - yes| any number - 0)?: "); int loadChoice = sc.nextInt();
                
                if(loadChoice != 1)
                {
                    System.out.print("Load amount: ");
                    load = sc.nextFloat();
                    cp[i] = new CellPhone(name, brand, load, talkTime, ratePerMinute, ratePerText);
                }
                else
                {
                    cp[i] = new CellPhone(name, brand, load, ratePerMinute, ratePerText);
                    break;
                }

                cp[i] = new CellPhone(name, brand, load, talkTime, ratePerMinute, ratePerText);
                
                do
                {
                    System.out.println("Phone " + (i + 1) + ":");
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

                    int ctr = 1;
                    for(CellPhone phone : cp) 
                    {
                        System.out.println("Phone " + ctr++ + ":");
                        System.out.println(phone);
                    }
                }
                while(choice != 5);
            }

        }
        catch (Exception e) 
        {
            System.out.println("Error");
        }

        
        sc.close();
    }
}