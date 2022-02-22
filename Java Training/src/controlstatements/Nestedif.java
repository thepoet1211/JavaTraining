package controlstatements;

import java.util.Scanner;

public class Nestedif {

	// Program to learn nestedif.

	public static void main(String args[]) {

		int a, b, c;

		int max = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value for a : ");

		a = s.nextInt();

		System.out.println("Enter value for b: ");

		b = s.nextInt();
		System.out.println("Enter value for c: ");
		c = s.nextInt();
		s.close();
		if (a > b)

		{

			if (a > c) {

				max = a;
			} else {

				max = c;
			}
		}

		else

		{

			if (b > c) {
				max = b;
			}

			else {
				// This else is associate with this if(b>c)

				max = c;

				System.out.println("\n max value = " + max);

			}
		}
	}
}
