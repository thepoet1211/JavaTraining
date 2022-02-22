package stringassignment;

import java.util.Scanner;

//Write a Java program to print after removing duplicates from given string.
public class Duplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();

		String y[] = str.split(" ");
		int j = y.length;
		String z = "";
		s.close();
		int i;
		for (i = 0; i < j; i++) {
			int count = 0;
			for (int k = i + 1; k < j; k++) {

				if (y[i].equals(y[k])) {

					count++;

				}

			}

			if (count == 0) {
				z = z + y[i] + " ";
			}

		}
		System.out.println(z);
	}
}
