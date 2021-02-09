/*
 1.) Write a class MyFileLastnameF1 that has the following methods:
 public boolean createFile(String filename)
 public boolean isFile(File file) //returns true if file is a file
 public boolean delete(File file) //deletes the file
 public boolean isDirectory(File file) //returns true if file is a directory
 public boolean writeToFile(String filename)
 public boolean readFromFile(String filename)
*/

import java.util.*;
import java.io.*;

public class MyFileEngbinoF1
{
	File myFile;

    MyFileEngbinoF1(){}

    public boolean createFile(String filename) throws Exception
    {
            myFile = new File(filename);
            
            if(myFile.exists()){
                return false;
            }else{
                myFile.createNewFile();
                return true;
            }
    }

    public boolean isFile(File file)
    {
            if(file.isFile()){
                return true;
            }else{
                return false;
            }
        }

    public boolean delete(File file)
    { 
            if(file.delete()){
                return true;
            }else{
                return false;
            }
        }

    public boolean isDirectory(File file)
    { 
            if(file.isDirectory()){
                return true;
            }else{
                return false;
            }
        }

        public boolean writeToFile(String filename, String seatStr)
        {
            try 
            {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.write("Write to file");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
                return true;
            } 
            catch (IOException e) 
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            return false;
        }

        public boolean readFromFile(String filename)
        {
            try {
                File myObj = new File(filename);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
                  
            
                  return true;
                  
                }
                
              } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
              return false;
        }
}