package stringassignment;

import java.util.Scanner;

//Write a Java program to print the frequency of each character in a string
public class Count {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string\n");
		String str = s.nextLine();

		String str1 = str.toLowerCase();
		s.close();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str1.charAt(j)) {
					count++;

				}
			}
			if (count > 0) {
				System.out.println("The frequency of the letter " + ch + " is " + count);

			}
		}

	}
}
