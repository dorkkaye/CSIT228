import java.io.*;
import java.util.*;

public class ReadFromFile{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
		String str = br.readLine();
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str," ");
		int sum = 0;
		while(st.hasMoreTokens())
			sum += Integer.parseInt(st.nextToken());
			//System.out.println(Math.pow(Integer.parseInt(st.nextToken()),3));
		System.out.println(sum);
	}
}