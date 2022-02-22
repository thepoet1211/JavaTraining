package assignment1;

//Program to print the reverse of the entered number.
import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int x = scan.nextInt();
		scan.close();
		int count = 0;
		for (int temp = x; temp != 0; count++) {
			temp = temp / 10;
		}
		int result = 0;
		count--;
		for (int temp = x; temp != 0; temp = temp / 10) {
			int remainder = temp % 10;
			result += remainder * Math.pow(10, count);
			count--;
		}
		System.out.println("REVERSE: " + result);
	}
}
