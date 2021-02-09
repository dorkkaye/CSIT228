import java.io.*;

public class WriteToFile{
	public static void main(String[] args)throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
		String str[] = {"2","4","6","8"};
		//bw.write(" Hello");
		for(int ctr = 0; ctr<str.length;ctr++)
			bw.write(str[ctr].concat(" "));
		System.out.println("Successfully written to file");
		bw.close();
	}
}