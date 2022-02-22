package string;

import java.util.Scanner;

//Program to check if the entered string is palindrome or not.
public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		int j = str.length();
		String y;
		s.close();
		y = "";
		for (int i = j - 1; i >= 0; i--) {
			y = y + str.charAt(i);
		}
		if (y.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
