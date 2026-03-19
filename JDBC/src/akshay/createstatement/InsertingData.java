package akshay.createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertingData {

	public static void main(String[] args) 
	{
		try
		{
			//load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Established connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","system","patil123");
			
			//execute statement
			Statement stmt = con.createStatement();
			
			//inserting record
			stmt.executeUpdate("insert into student values(1,'akshay',80)");
			System.out.println("record inserted");
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


/* executeUpdate():- method are use to performing DML operation in database.
 * java code executed under JRE and SQL code executed under database.  */
 