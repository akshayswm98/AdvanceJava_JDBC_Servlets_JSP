package akshay.createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateInsertRead 
{
	public static void main(String[] args) 
	{
		try 
		{
			// load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","system","patil123");

			// create statement
			Statement stmt = con.createStatement();

			// create table
			try 
			{
				stmt.executeUpdate("create table employee(empid number(4), empname varchar2(10), empsal number(6))");
				System.out.println("Table Created Successfully...!");
			} 
			catch (Exception e) 
			{
				System.out.println("Table Already Exists");
			}

			// insert record
			stmt.executeUpdate("insert into employee values(1,'akshay',10000)");
			stmt.executeUpdate("insert into employee values(2,'doma',30000)");
			stmt.executeUpdate("insert into employee values(3,'lomya',50000)");
			stmt.executeUpdate("insert into employee values(4,'bhujya',20000)");

			System.out.println("Records Inserted Successfully");

			// read record
			ResultSet rs = stmt.executeQuery("select * from employee");
			System.out.println("Print Employee Data:");

			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " +rs.getInt(3));
			}

			// close connection
			con.close();

		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}