package akshay.createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintData 
{
	public static void main(String[] args) 
	{
		try 
		{
			// Load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Create connection
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/ORCL",
				"system",
				"patil123");

			// Create statement
			Statement stmt = con.createStatement();

			// Execute query
			ResultSet rs = stmt.executeQuery("select * from student");

			// Print data properly
			while (rs.next()) 
			{
				System.out.println(
					rs.getInt(1) + " " +
					rs.getString(2) + " " +
					rs.getInt(3));
			}

			// Close connection
			con.close();

		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}