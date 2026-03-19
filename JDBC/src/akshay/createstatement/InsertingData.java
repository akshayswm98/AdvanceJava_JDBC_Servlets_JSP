package akshay.createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingData {

	public static void main(String[] args) 
	{
		try
		{
			//load driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    
		    //established Connection
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","system","patil123");
		    
		    //execute statement
		    Statement stmt = con.createStatement();

		    // insert record
		    stmt.executeUpdate("insert into student values(1,'karan',70)");

		    System.out.println("Record Inserted Successfully..!");
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}

}
