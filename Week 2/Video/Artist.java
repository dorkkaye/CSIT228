/*
    2. Write a class named Artist with the following attributes: firstName, lastName and middleInitial. 
       Provide getters/setters for the lastName. Override the toString method of the Object class.  
       It will follow the format <firstName> <middleInitial>. <lastName> for example: Sigurado N. Pasar for its string representation.
*/

class Artist 
{
    //attributes
    private String firstName;
    private String lastName;
    private String middleInitial;

    Artist(){}  

    Artist(String firstName, String middleInitial, String lastName)
    {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial)
    {
        this.middleInitial = middleInitial;
    }

    //setter for lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getMiddleInitial()
    {
        return middleInitial;
    }

    //getter for lastName
    public String getLastName()
    {
        return lastName;
    }

    public String toString()
    {
        //format: <firstName> <middleInitial>. <lastName>
        return firstName + " " + middleInitial + ". " + lastName;
    }
}
