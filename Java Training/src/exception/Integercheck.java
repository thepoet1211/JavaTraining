package exception;

import java.util.*;

/* Get the input String from user and parse it to integer, if it is not a
number it will throw number format exception Catch it and print "Entered
input is not a valid format for an integer." or else print the square of
that number. (Refer Sample Input and Output).*/


public class Integercheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			int n = Integer.parseInt(s);
			System.out.println(n * n);
		} catch (Exception e) {
			System.out.println("Entered input is not a valid  format for  an integer.");
		}
		sc.close();

	}
}
