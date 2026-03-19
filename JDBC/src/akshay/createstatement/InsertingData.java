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
		    stmt.executeUpdate("insert into student values(2,'akshay',60)");
		    stmt.executeUpdate("insert into student values(3,'vaishu',80)");
		    stmt.executeUpdate("insert into student values(4,'samarth',50)");
		    stmt.executeUpdate("insert into student values(5,'sujal',30)");
		    stmt.executeUpdate("insert into student values(6,'sunita',50)");

		    System.out.println("Record Inserted Successfully..!");
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}

}


/* executeUpdate():- method are use to performing DML operation in database.
 * java code executed under JRE and SQL code executed under database.  */
 