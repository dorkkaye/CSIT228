public class Name extends Mobile
{
    private String firstname;
    private String middlename;
    private String lastname;

    public Name(){}

    public Name(String firstname, String middlename, String lastname)
    {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = firstname;
    }

    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }

    public void setMiddleName(String middlename)
    {
        this.middlename = middlename;
    }

    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstName()
    {
        return firstname;
    }
    
    public String getMiddleName()
    {
        return middlename;
    }
    
    public String getLastName()
    {
        return lastname;
    }

    public String toString()
    {
        return firstname + " " + middlename + " " + lastname;
    }
}