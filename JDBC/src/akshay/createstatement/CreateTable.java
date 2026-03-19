package akshay.createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) 
	{
		try
		{
			//load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//established connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","system","patil123");
			
			//create statement
			Statement stmt = con.createStatement();
			stmt.execute("create table student(rollno number(4),name varchar2(10),marks number(4))");
			System.out.println("Table Created Successfully..!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


/*createStatement():- method are use to Established Static Statement Connection.
 * execute are used to DDL command for creating table and so on. */
 