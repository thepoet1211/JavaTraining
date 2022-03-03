package hotelmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Book extends BackEnd {
	Scanner s = new Scanner(System.in);
	BackEnd j=new BackEnd();
	public void book() {
		
		int ab= j.remainingrooms();
		
			String Name;
			int room;
			int days;
			String Mobile;
			System.out.println("Enter your name ");
			Name = s.nextLine();
			System.out.println("Enter your mobile number ");
			Mobile = s.nextLine();
			System.out.println("Enter the number of rooms you want to book");
			room = s.nextInt();
			System.out.println("Enter the number of days you want to stay with us");
			days = s.nextInt();
			if (room <= ab) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("Jdbc:mysql:///hotel", "root", "P@rth$00d");
				Statement stmt = con.createStatement();
				String query = "insert into hotel.customer(Name,Days,Rooms,Mobile) values('" + Name + "'," + days + ","
						+ room + ",'" + Mobile + "')";
				int i = stmt.executeUpdate(query);
				if (i > 0) {
					System.out.println("Record inserted");
				} else {
					System.out.println("Error");
				}
			} catch (Exception e) {
				System.out.println("Exception has occurred " + e);
			}
		}

		else {
			System.out.println("We only have " + ab + " rooms remaining.");

		}
	}
}
