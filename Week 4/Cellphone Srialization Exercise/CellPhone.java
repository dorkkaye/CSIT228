import java.io.*;

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
}