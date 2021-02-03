/**
    1. Write an interface named VisualMaterial with two(2) abstract methods. 
       The first method named copyrightNotice and the second method named length that returns the length in minutes of the visual material.	Both methods
        have no parameters. It also has two constant attributes, first one is named VID_LINE which contains the value "I can do it! God bless." and the 
        second one named MAX_CONTENT which holds the value 100. 
 */

interface VisualMaterial    
{
    //abstract methods
    public void copyrightNotice();   
    public int length();    //returns the length in minutes of the visual material

    //constant attributes
    final String VID_LINE = "I can do it! God bless.";
    final int MAX_CONTENT = 100;
}