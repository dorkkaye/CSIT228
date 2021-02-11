import java.io.*;

public class FileMethodDemo{
	File myfile;
	//create file method
	public boolean createMyFile(String filename)throws Exception
	{
		myfile	= new File(filename);

		if (myfile.exists())
			return false;
		else
		{
			myfile.createNewFile();
			return true;
		}
	}

	//delete file method
	//rename a file method
	//write to a file method
	//read from a file method

	//simple main method

}