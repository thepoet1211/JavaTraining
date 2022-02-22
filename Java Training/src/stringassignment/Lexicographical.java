package stringassignment;

import java.util.Scanner;
//Write a Java program to compare two strings lexicographically,ignoring case differences.

public class Lexicographical {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = s.nextLine();
		System.out.println("Enter the second string");
		String str2 = s.nextLine();
		s.close();
		int result = str1.compareToIgnoreCase(str2);
		if (result < 0) {
			System.out.println("Str1 is less than Str2");
		} else if (result > 0) {
			System.out.println("Str1 is greater than Str2");
		} else {
			System.out.println("Str1 is equal to Str2");
		}
	}

}
