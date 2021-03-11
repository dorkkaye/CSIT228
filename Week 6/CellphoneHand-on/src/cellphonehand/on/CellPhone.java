/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphonehand.on;

/**
 *
 * @author Kaye P. Engbino
 */
public class CellPhone 
{
    //Date members
    private double load;
    private double talkTime;
    private double ratePerMinute;
    private double ratePerText;
    
    public CellPhone(){}
    
    //2. provide a constructor that would initialize all the attributes 
    CellPhone(double load, double talkTime, double ratePerMinute, double ratePerText)
    {
        this.load = load;
        this.talkTime = talkTime;
        this.ratePerMinute = ratePerMinute;
        this.ratePerText = ratePerText;
    }
    
    /*
        3. override the first constructor, allow the user to initialize all 
           the attributes except the load, instead, directly set load to 300. 
    */
    CellPhone(double load, double ratePerMinute, double ratePerText)
    {
        this.setLoad(300);;
        this.ratePerMinute = ratePerMinute;
        this.ratePerMinute = ratePerMinute;
    }
    
//1. Define getter 
    public void setLoad(double load) { this.load = load; }
    public void setTalkTime(double talkTime) { this.talkTime = talkTime; }
    public void setRatePerMinute(double ratePerMinute) { this.ratePerMinute = ratePerMinute; }
    public void setRatePerText(double ratePerText) { this.ratePerText = ratePerText;}

    //setter methods
    public double getLoad() { return load; }
    public double getTalkTime() { return talkTime; }
    public double getRatePerMinute() { return ratePerMinute; }
    public double getRatePerText() { return ratePerText; }
    
    /*
        4. implement this method:
           HINT: you will use the ratePerMinute here. The duration is per min.
    */
    public double callCost(double duration)
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
    double callFloat(double duration)
    {
        callBool(duration);    //Check if call is possible

        this.talkTime -= duration;

        return callCost(duration);
    }

    boolean callBool(double duration)
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

    public double addLoad(double amount)
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
}
