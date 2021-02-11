fikeimport java.io.*;
import java.util.*;
public class FileDemo1{
	public static void main(String[] args)throws Exception{
		Scanner s = new Scanner(System.in);

		String filenames[] = new String[100];
		System.out.println("How many files do you want to create?");
		int num = s.nextInt();

		File mydir = new File("CSIT228F1");
		mydir.mkdir();

		File files[] = new File[num];

		for(int ctr = 0; ctr<files.length; ctr++){
			System.out.println("Filename for file["+ctr+"]: ");
			filenames[ctr] = s.next();
			files[ctr] = new File(mydir, filenames[ctr]);
			files[ctr].createNewFile();
		}


	}
}