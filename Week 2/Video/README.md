1. Write an interface named VisualMaterial with two(2) abstract methods. 
The first method named copyrightNotice and the second method named length that returns the length in minutes of the visual material.	Both methods have no parameters. It also has two constant attributes, first one is named VID_LINE which contains the value "I can do it! God bless." and the second one named MAX_CONTENT which holds the value 100. 

2. Write a class named Artist with the following attributes: firstName, lastName and middleInitial. 
Provide getters/setters for the lastName. Override the toString method of the Object class.  It will follow the format <firstName> <middleInitial>. <lastName> for example: Sigurado N. Pasar for its string representation.

3. Write an abstract class named Video which is a VisualMaterial with five(5) attributes: code, title, Artist, category and length.
Provide two(2) constructors: the first one allows the initialization of all attributes and the second constructor automatically set the category to "Commedy" while allowing the setting of the values of the rest of the attributes. 
The class implements all the methods of the VisualMaterials. Video also have an abstract method named display that outputs the content of the attributes.  Sample output of the display method if implemented would be:
Code: COMP-JAV-0123
Title: Programming in Java
Artist: James I. Gooseling
Category: Commedy
Length: 150

4. Write a class named CommedyVideo which is a Video. It has an additional attribute setting and isInYouTube. 
Setting refers to a specific place it was shot while the isInYouTube represents its availability YouTube. Provide two(2) constructors: the first one sets the setting to "CIT University";  and the second constructor sets the setting to "Cebu City" and isInYouTube to true. It overrides the equals method of the Object class.  Two CommedyVideo are equal if the code and setting are the same.

5. Write a class named VideoList which contains a list of Video implemented using array. 
It should have additional attributes named count and max. The count represents the number of Video objects inside the array while the max is initialized by the user through the constructor which represents the maximum capacity of the list.  Provide a constructor that sets the max value by calling the MAX_CONTENT attribute of the VisualMaterial class. Implement the following methods:
 - public boolean addVideo(Video video); // returns true if successfully added in the list else false
 - public int search(Video video); // returns -1 if not found and returns the index value if found
 - public boolean removeVideo(Video video); // removes the video on the list and returns if it is successful or not
   // replace the video being removed by replacing it with the last element of the list
 - public void displayList(); // displays the video contents using foreach 
