package hotelmanagementsystem;
import java.sql.*;
import java.util.*;
public class CheckIn {
	int bill;
	
	Scanner s=new Scanner(System.in);
	void checkin() {
		System.out.println("Enter the mobile number of the client");

String Mobile=s.nextLine();
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("Jdbc:mysql:///hotel", "root", "P@rth$00d");
	Statement stmt = con.createStatement();
	String query = "update hotel.customer set StayStarted=1 where Mobile='"+Mobile+"'";
	int i = stmt.executeUpdate(query);
	if (i > 0) {
		System.out.println("Successfully Checked In");
	} else {
		System.out.println("Error");
	}
} catch (Exception e) {
	System.out.println("Exception has occurred " + e);
}
}
	void checkout() {
		System.out.println("Enter the mobile number of the client");
		String Mobil=s.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("Jdbc:mysql:///hotel", "root", "P@rth$00d");
			Statement stmt = con.createStatement();
			String query = "update hotel.customer set StayStarted=0 where Mobile="+Mobil+"";
			int i = stmt.executeUpdate(query);
			if (i > 0) {
				System.out.println("Successfully Checked out");
				
			} else {
				System.out.println("Error");
			}
			String query1 = "select Days,Rooms from hotel.customer where Mobile="+Mobil+"";
			 ResultSet rs = stmt.executeQuery(query1);
			 while(rs.next())
			{
			 int day=rs.getInt("Days");
			int room=rs.getInt("Rooms");		 
			 int cost =2000*day*room;
			 System.out.println("Your bill is "+cost);
			}
			
		} catch (Exception e) {
			System.out.println("Exception has occurred " + e);
		}
	}

}
