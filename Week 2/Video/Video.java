/*
    3. Write an abstract class named Video which is a VisualMaterial with five(5) attributes: code, title, Artist, category and length.
       Provide two(2) constructors: the first one allows the initialization of all attributes and the second constructor automatically set 
       the category to "Commedy" while allowing the setting of the values of the rest of the attributes. 
       The class implements all the methods of the VisualMaterials. Video also have an abstract method named display that outputs the content of the 
       attributes.  
       Sample output of the display method if implemented would be:
       Code: COMP-JAV-0123
       Title: Programming in Java
       Artist: James I. Gooseling
       Category: Commedy
       Length: 150
*/

abstract class Video implements VisualMaterial
{
    //Attributes
    private String code;
    private String title;
    private Artist artist;
    private String category;
    private int length;

    Video(){}

    Video(String code, String title, Artist artist, int length)
    {
        this.code = code;
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    //Constructor that allows the initialization of all attributes
    Video(String code, String title, Artist artist, String category, int length)
    {
        this.code = code;
        this.title = title;
        this.artist = artist;
        this.category = category;
        this.length = length;
    }

    //Automatically set the category to "Commedy" while allowing the setting of the values of the rest of the attributes
    Video(String code, String title, Artist artist, String category)
    {
        this.code = code;
        this.title = title;
        this.artist = artist;
        this.category = "Commedy";
    }

    public void setCode(String code)
    {
        this.code = code;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public String getCode()
    {
        return code;
    }

    public String getTitle()
    {
        return title;
    }

    public String getCategory()
    {
        return category;
    }

    public int getLength()
    {
        return length;
    }

    public void display()
    {
        /*
            Sample output of the display method if implemented would be:
            Code: COMP-JAV-0123
            Title: Programming in Java
            Artist: James I. Gooseling
            Category: Commedy
            Length: 150
        */

        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist.getFirstName() + " " + artist.getMiddleInitial() + ". " + artist.getLastName());
        System.out.println("Category: " + category);
        System.out.println("Length: " + length);
    }
}