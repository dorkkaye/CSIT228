import java.util.*;

public class TestATMCardClass
{
    public static void main(String[] arg)
    {
        int choice, x = 1;

        Scanner sc = new Scanner(System.in);
        Name n = new Name("Juan", "dela", "Cruz");
        ATMCard atm = new ATMCard();

        System.out.println("Enter name: <<" + n.toString() + ">>");
        atm.setcardNumbe("A101-1125");
        System.out.printf("Enter account number: %s", atm.getcardNumber());
        atm.setBalance(1000.00);
        System.out.printf("\nEnter beginning balance: %.2f", atm.getBalance());

        while(x == 1)
        {
            System.out.println("\n\nDEBIT CARD TRANSACTION");
            System.out.println("[1] Deposit Cash");
            System.out.println("[2] Withdraw Cash");
            System.out.println("[3] Inquire Balance");
            System.out.println("[4] Calculate Interest Rate");
            System.out.println("[5] Exit\n");

            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter amount: ");   //500.50
                    atm.depositMoney(sc.nextDouble());

                    System.out.println("\nEnter name: <<" + n.toString() + ">>");
                    System.out.printf("Enter account number: %s", atm.getcardNumber());
                    System.out.printf("\nNew balance: %.2f", atm.getBalance());

                    break;
                case 2:
                    System.out.print("\nEnter amount: ");   //200.00 , 1500.00
                    
                    if(atm.withdrawMoney(sc.nextFloat()) == true)
                    {
                        System.out.println("\nEnter name: <<" + n.toString() + ">>");
                        System.out.printf("Enter account number: %s", atm.getcardNumber());
                        System.out.printf("\nNew balance: %.2f", atm.getBalance());
                    }
                    else
                        System.out.println("\nINSUFFICIENT FUNDS");

                    break;
                case 3:
                    atm.checkBalance();

                    System.out.println("\nEnter name: <<" + n.toString() + ">>");
                    System.out.printf("Enter account number: %s", atm.getcardNumber());
                    System.out.printf("\nBalance: %.2f", atm.getBalance());

                    break;
                case 4:
                    System.out.print("\nEnter rate: ");   //3.5
                    atm.interest(sc.nextDouble());

                    System.out.println("\nEnter name: <<" + n.toString() + ">>");
                    System.out.printf("Enter account number: %s", atm.getcardNumber());
                    System.out.printf("\nNew balance: %.4f", atm.getBalance());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        
        sc.close();
    }
}