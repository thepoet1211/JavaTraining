package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Tabl1 {
	public static void main(String args[])
	 {
	try
	{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/iiche","root","P@rth$00d");
	 Statement stmt = con.createStatement();

	 String query = "create table list(id int, name varchar(20))";
	 stmt.executeUpdate(query);
	 }
	catch(Exception e)
	{
	 System.out.println("Exception has occured "+e);
	}
	 }
}
