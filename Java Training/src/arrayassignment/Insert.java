package arrayassignment;

import java.util.Scanner;
//program to insert a value at an index
public class Insert {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of the length of the array: ");
		n = s.nextInt();

		int[] arr = new int[n];
		int[] newarr = new int[n + 1];
		System.out.println("Enter the numbers of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the value of the index at which you want to insert: ");
		int y = s.nextInt();
		System.out.println("Enter the value you want to insert: ");
		int l = s.nextInt();

		if (y > n) {
			System.out.println("The value of " + y + " is greater than the length of the array");
		} else {
			for (int p = 0; p < y; p++) {
				newarr[p] = arr[p];
			}

			for (int j = y; j < n; j++) {
				newarr[j + 1] = arr[j];
			}
			newarr[y] = l;
			System.out.println("Old array: ");
			for (int o = 0; o < n; o++) {
				System.out.println(arr[o]);
			}
			System.out.println("\nNew array: \n_________________________\n");
			for (int o = 0; o <= n; o++) {
				System.out.println(newarr[o]);
			}
		}
		s.close();
	}
}
