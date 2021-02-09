import java.io.*;
public class FileDemo{

	public static void main(String[] args) throws Exception{
		try{
			//create a directory
			File mydir = new File("CSIT228F1");		//not yet created
			mydir.mkdir();							//boolean
			//System.out.println(b);

			//Create a File
		/*	File myfile = new File("myfilename.txt");
			myfile.createNewFile();		*/
			//System.out.println(b);

			//Create a File inside a Directory
			File myfile = new File(mydir,"Exercise4.xls");
			myfile.createNewFile();

			System.out.println(myfile.exists());
			System.out.println(myfile.isFile());
			System.out.println(myfile.isDirectory());
			System.out.println(myfile.getName());
			System.out.println(myfile.getAbsolutePath());
			System.out.println(myfile.getPath());
			System.out.println(myfile.length());
			System.out.println(myfile.lastModified());

			//printing the files inside the directory
	/*		String files[] = mydir.list();
			for (int ctr=0; ctr<files.length; ctr++)
				System.out.println(files[ctr]);*/

		}catch(Exception ex){
			System.err.println(ex.getMessage());
		}

	}

}