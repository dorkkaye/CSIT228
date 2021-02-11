import java.io.*;
import java.util.*;

public class MyFileCabellonF1{
	File myFile;
 public boolean createFile(String filename){
 		myFile = new File(filename);
 		if(myFile.exists()){
 			return false;
		}else{
			myFile.createNewFile();
			return true;
		}
 	}

 public boolean isFile(File file){//returns true if file is a file
		if(file.isFile()){
			return "File";
		}else{
			return "Not a File";
		}
	}

 public boolean delete(File file){ //deletes the file
		if(file.delete()){
			return "Deleted";
		}else{
			return "Not Deleted";
		}
	}

 public boolean isDirectory(File file){ //returns true if file is a directory
		if(file.isDirectory()){
			return "Directory";
		}else{
			return "Not Directory";
		}
	}
 public boolean writeToFile(String filename){
 		public static void main(String[] args)throws Exception{
			BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
				String str[] = {"2","4","6","8"};
				for(int ctr = 0; ctr<str.length;ctr++)
					bw.write(str[ctr].concat(" "));
				System.out.println("Successfully written to file");
				bw.close();
		}
 	}
 public boolean readFromFile(String filename){
			public static void main(String[] args) throws Exception{
				BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
				String str = br.readLine();
				System.out.println(str);
				br.close();
		}
 	}



}