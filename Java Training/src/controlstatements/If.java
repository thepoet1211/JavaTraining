package controlstatements;

import java.util.Scanner;

//Program to learn if statement.
public class If {
	public static void main(String[] args)

	{

		int marks;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Your Marks: ");

		marks = in.nextInt();
		in.close();
		if (marks >= 36) {

			System.out.println("You are Pass.");
		}

	}
}
