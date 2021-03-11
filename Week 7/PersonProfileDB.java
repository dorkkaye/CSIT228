import java.sql.*;

public class PersonProfileDB{
	public static void main(String[] args){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//establishing database connection
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:StudentProfile","","");
			System.out.println("connection established...");
			stmt = con.createStatement();

			//inserting a record
			/*String name = "Jacob";
			int age = 1;
			String query = "Insert into profile values('"+name+"',"+age+")";
			stmt.executeUpdate(query);
			System.out.println("data saved...");*/

		}catch(Exception ex){}
	}
}