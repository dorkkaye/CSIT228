public class ATMCard extends Name
{
    private String cardNumber;
    private double balance;
    
    public ATMCard(){}

    public ATMCard(Name name, String cardNumber, double balance)
    {
        super(name.getFirstName(), name.getMiddleName(), name.getLasstName());
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void setcardNumbe(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getcardNumber()
    {
        return cardNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public double checkBalance()
    {
        return this.balance;
    }

    public double depositMoney(double amount)
    {
        return balance += amount;
    }

    public boolean withdrawMoney(float amount)
    {
        if(amount > balance)
            return false;
        else
        {
            this.balance -= amount;
            return true;
        }
    }

    public double interest(double rate)
    {
        double interest = balance * (rate/100);

        return depositMoney(interest);
    }

    public String toString()
    {
        return "Name: " + super.getFirstName() + "\nAccount Number: " + cardNumber + "\nBalance: " + balance;
    }
}