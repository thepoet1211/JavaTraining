package stringassignment;

import java.util.Scanner;

//Write a java program to convert given string in lower and upper case.
public class LowerUpper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = s.nextLine();
		s.close();
		String y = str.toLowerCase();
		String z = str.toUpperCase();
		System.out.println("The Upper case of the string " + str + " is: " + z + " ,and the lower case is: " + y);

	}

}
