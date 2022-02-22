package videoProject;

import java.util.*;

public class VideoStore {
	static int n;
	Scanner s;
	String[] title;
 VideoStore(int n) {
	
		this.n=n;
		 s = new Scanner(System.in);
		title = new String[n];
	}
	
	
	

	void addVideo() {

		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name of the movie you want to enter: ");
			String titl = s.nextLine();
			title[i] = titl;
		}

	}

	void checkout(String title1) {
		System.out.println("Enter the title of the video you want to check out: ");
		title1 = s.nextLine();
		for (int i = 0; i < title.length; i++) {
			if (title1.equalsIgnoreCase(title[i]) ) {
				for (int j = i; j < title.length; j++) {
					title[j] = title[j + 1];
					
				}
			}
		}
	}

	void returnVideo() {
		System.out.println("Enter the title of the video you want to return");
		String title2 = s.nextLine();
		int n = title.length;
		title[n + 1] = title2;
	}

	void userRating() {

		System.out.println("Enter the rating of out of 5");
		int rating = s.nextInt();
		System.out.println("The rating is " + rating);
	}

	void list() {
		System.out.println("The videos available are: ");
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i]);
		}
	}

}
