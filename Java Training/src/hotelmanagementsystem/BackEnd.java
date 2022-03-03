package hotelmanagementsystem;

import java.sql.*;


public class BackEnd {
	
	public int a;
	public int sum = 0;
	public static int NumberOfRooms = 20;
	public int remainingrooms() 
	{
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("Jdbc:mysql:///hotel", "root", "P@rth$00d");
			Statement stmt = con.createStatement();
			String query = "SELECT sum(Rooms) FROM hotel.customer WHERE StayStarted=1";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				sum = sum + rs.getInt("sum(Rooms)");

			}
			a = 20 - sum;

	
		System.out.println("The available number of rooms are " + (a));
	}
	
	catch(Exception e)
	{
		System.out.println("Exception has occured " + e);
	}
	

}
	
	return a;}}