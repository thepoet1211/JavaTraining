package stringassignment;

import java.util.Scanner;

//Write a Java program to calculate the sum of the numbers appear in a given string.
public class Sum {
	public static void main(String[] args) {// A temporary string
		Scanner s = new Scanner(System.in);
		String temp = "0";
		System.out.println("Enter a string with numbers");
		String str = s.nextLine();

		int sum = 0;
		s.close();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch))
				temp += ch;

			else {

				sum += Integer.parseInt(temp);

				temp = "0";
			}
		}

		int k = sum + Integer.parseInt(temp);
		System.out.println(k);
	}

}
