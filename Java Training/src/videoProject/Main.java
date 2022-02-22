package videoProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the video store!!");
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number of movies ");
		VideoStore obj = new VideoStore(s.nextInt());
		Scanner sc= new Scanner(System.in);
		
	
		obj.addVideo();
				
		
		
		System.out.println("Press 1 if you want to checkout the vide and press 2 if you want to retuen a video");
		int a;
				a=s.nextInt();
		if(a==1)
		{
			obj.checkout(null);
			obj.list();
		}
		if(a==2) {
			obj.returnVideo();
			obj.userRating();
		}
		
		// TODO Auto-generated method stub

	}

}
