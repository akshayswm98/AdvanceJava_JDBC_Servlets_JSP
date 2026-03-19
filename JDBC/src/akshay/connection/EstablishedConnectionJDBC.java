package akshay.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishedConnectionJDBC {

    public static void main(String[] args) 
    {
    	
      try {
    	  //load driver
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	
        	//established connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","system","patil123");

            System.out.println("Connection Established Successfully");

            con.close();

            } 
    	catch (Exception e) 
    	{
            e.printStackTrace();
    	}    
    }
}

// forName method:- we will use to provide oracle class name. belong from Class.
//getConnection:- we will use provide id and pass 