public abstract class Phone // Define an abstract class Phone
{
    //2 data members
    protected String name;
    protected String brand;

    Phone(){}

    //1. Define a constructor initializing the data members. 
    Phone(String name, String brand)
    {
        this.name = name;
        this.brand = brand;
    }

    /*
        2. declare an abstract method named call with a parameter duration of
	 	   //type float and boolean as the return type
    */
    abstract float callFloat(float duration);
    abstract boolean callBool(float duration);

    //3. override the toString method
    public String toString()
    {
        return "Name: " + name + 
             "\nBrand: " + brand;
    }
 }