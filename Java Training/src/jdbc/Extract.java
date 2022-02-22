package jdbc;
import java.sql.*;
public class Extract {
	{
		 public static void main(String args[])
		 {
		 try
		 {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con =DriverManager.getConnection("Jdbc:mysql:///demodb","root","");
		 Statement stmt = con.createStatement();
		 String query = "select id,name from list";
		 ResultSet rs = stmt.executeQuery(query);
		 while(rs.next())
		{
		 System.out.println("Id=="+rs.getInt("id")+"----Name--"+rs.getString("name"));
		}
		 }
		 catch(Exception e)
		 {
		System.out.println("Exception has occured "+e);
		 }
		 }
		}
}
