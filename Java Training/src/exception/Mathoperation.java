package exception;

/* Write a class MathOperation which accepts integers from command line.
Create an array using these parameters. Loop through the array and
obtain the sum and average of all the elements.
Display the result.
Check for various exceptions that may arise like ArithmeticException,
NumberFormatException, and so on.
*/

import java.util.*;

public class Mathoperation {
	static public void array() {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("Enter the number of numbers you want to enter");
		a = s.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the numbers");
		for (int i = 0; i < a; i++) {
			arr[i] = s.nextInt();
		}
		int sum = 0;
		for (int j = 0; j < a; j++) {
			sum = sum + arr[j];
		}
		int avg = sum / a;
		System.out.println("The avg is " + avg + " the sum is " + sum);
		s.close();

	}

	public static void main(String args[]) {
		try {
			array();
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
