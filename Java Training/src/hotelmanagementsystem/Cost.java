package hotelmanagementsystem;

import java.util.*;

public class Cost {
	void cost() {
		Scanner s = new Scanner(System.in);
		int price = 2000;
		int room;
		int day;
		System.out.println("Enter the number of rooms you want to book");
		room = s.nextInt();
		System.out.println("Enter the number of days you want to stay for");
		day = s.nextInt();
		int cost = price * day * room;
		System.out.println("It will cost you " + cost + " to book " + room + " for " + day + " days");
s.close();	}
}
