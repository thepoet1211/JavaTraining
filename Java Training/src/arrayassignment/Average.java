package arrayassignment;

import java.util.*;

//Program to find the average of an array.
public class Average {
	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of the length of the array: ");
		n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the numbers of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		float sum = 0;
		s.close();
		for (int j = 0; j < n; j++) {
			sum = sum + arr[j];

		}
		float average = sum / n;
		System.out.println("The averagre value of the array is " + average);
	}
}
