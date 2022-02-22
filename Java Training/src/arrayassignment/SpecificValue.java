package arrayassignment;

import java.util.Scanner;

// To check if a specific value exists in the array.
public class SpecificValue {
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
		System.out.println("Enter the value of the number you want to check: ");
		int y = s.nextInt();
		int count = 0;
		for (int k = 0; k < n; k++) {
			if (arr[k] == y) {
				System.out.println("Yes the value " + y + " exists at the index " + k);
				count++;
			}

			s.close();
		}
		if (count == 0) {
			System.out.println("The Value " + y + " does not exist in the array");
		}
	}

}
