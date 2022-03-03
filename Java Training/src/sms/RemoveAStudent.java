package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RemoveAStudent {
	void rm(int rn){
	{

	
	try {

		Connection con = DriverManager.getConnection("Jdbc:mysql:///vote", "root", "P@rth$00d");
		Statement stmt = con.createStatement();
		String query = "DELETE FROM voterdetails WHERE RN="+rn+"";
		int i=stmt.executeUpdate(query);
		if(i>0) {
System.out.println("Removed succesfully");
	} 
	else{
	System.out.println("Does not exist");
	}}
	catch (Exception e) {
	
		System.out.println("Exception has occurred " + e);
	}
	

}}}
