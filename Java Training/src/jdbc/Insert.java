package jdbc;
import java.sql.*;

public class Insert {
	 public static void main(String args[])
	 {
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("Jdbc:mysql:///iiche","root","P@rth$00d");
	Statement stmt = con.createStatement();
	String query = "insert into list(id,name) values(101,'Ravi')";
	int i = stmt.executeUpdate(query);
	if(i>0)
	{
	System.out.println("Record inserted");
	}
	else{
	System.out.println("Error");
	}
	 }
	 catch(Exception e)
	 {
	System.out.println("Exception has occurred "+e);
	 }
	}
}
