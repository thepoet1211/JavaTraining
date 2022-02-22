package stringassignment;

import java.util.Scanner;

//Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.
public class Mn {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		int k = str.length();
		s.close();
		int count = 0;
		for (int i = 0; i < k - 1; i++) {

			if (str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'M' || str.charAt(i) == 'N') {
				if (str.charAt(i + 1) == ' ' && str.charAt(i - 1) != ' ') {
					count++;
				}

			}
		}
		System.out.println(count);
	}

}
