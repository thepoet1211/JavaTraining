package videoProject;

import java.util.Scanner;

public class Video {
	Scanner s = new Scanner(System.in);
	public int flag;
	public int rating;
	public String title[]= {};
void adVideo(String titl) {
		
		System.out.println("Enter the name of the movie you want to enter: ");
		titl = s.nextLine();

	}
void chekout(String titl) {
	System.out.println("Enter the title of the video you want to check out: ");
	titl = s.nextLine();
}

}
