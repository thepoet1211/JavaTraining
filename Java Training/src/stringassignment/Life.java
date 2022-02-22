package stringassignment;

import java.util.Scanner;

//Write a Java program to count how many times the substring 'life' present at anywhere in a given string
public class Life {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:\n");
		String str = s.nextLine();
		System.out.println("String :" + str);
		System.out.println("entersubstring:\n");
		String substr = s.nextLine();
		int subStrCount = 0;
		s.close();

		int index = 0;
		while ((index = str.indexOf(substr, index)) >= 0) {
			subStrCount++;
			index = index + substr.length();

		}

		System.out.println("Substring: " + substr + " found " + subStrCount + " times!");

	}
}
