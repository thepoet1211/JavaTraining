package hotelmanagementsystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		System.out.println("Welcome to My Hotel Management System");
		System.out.println(
				"What are you here to do? \n1)Book Rooms\n2)Check In\n3)Check Out\n4)Get An Estimate for your stay\n5)Check availablity of rooms");
		int ab;
		Scanner s = new Scanner(System.in);
		ab = s.nextInt();
		if (ab == 1) {
			Book ak = new Book();
			ak.book();
		}
		if (ab == 2) {
			CheckIn a = new CheckIn();
			a.checkin();
		}
		if (ab == 3) {
			CheckIn bc = new CheckIn();
			bc.checkout();
		}
		if (ab == 4) {

			System.out.println("Enter the number of days you want to stay for");
			int p = s.nextInt();
			System.out.println("Enter the number of rooms you want to book");
			int y = s.nextInt();
			int j = p * y * 2000;
			System.out.println("It will cost you " + j + "rupees.");

		}
		if (ab == 5) {

			BackEnd c = new BackEnd();

			c.remainingrooms();
			s.close();
		}
	}
}
