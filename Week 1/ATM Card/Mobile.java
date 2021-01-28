public class Mobile
{
    private String mobilenumber;

    public Mobile(){}

    public void setMobileNumber(String mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    public String getMobileNumber()
    {
        return mobilenumber;
    }

    public String toString()
    {
        return "Mobile Number: " + mobilenumber;
    }
}