(A) Define an abstract class Phone having 2 data members defined below: 
protected String name;
protected String brand;
	1. Define a constructor initializing the data members. 
	2. declare an abstract method named call with a parameter duration of
	 	//type float and boolean as the return type
	3. override the toString method

(B) Define a class CellPhone implementing the abstract class Phone. The CellPhone class has 3 data members: 
private float load, talkTime, ratePerMinute, ratePerText; 
	1. Define getter and setter methods for all attributes. 
	2. provide a constructor that would initialize all the attributes 
	3. override the first constructor, allow the user to initialize all the 	attributes except the load, instead, directly set load to 300. 
	4. implement this method: public float callCost(float duration);
	// HINT: you will use the ratePerMinute here. The duration is per min.
	5. implement the call method: you are allowed to call if the duration is 	less than or equal to the available talkTime and you have enough load to 	complete the call. NOTE: you have to call callCost method and don’t forget 	to deduct the talkTime 
	6. & 7. implement all other methods needed for this class not to encounter 		compile time error.
	
	  public boolean isLowBat(); 
		// returns true if the talkTime is equal to zero.
	public boolean text(); 
		/* reduces the load by its ratePerText and returns true
		if text is successfully sent and it consumes 0.05 minute of the 		talkTime.*/
	8. override the toString method. 		
	9. Write a main method implementing all the methods defined above. 

NOTE: talkTime - number of minutes you can call and text without draining your battery.