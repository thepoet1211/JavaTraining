package exception;

import java.util.*;

/* Write a program that takes as input the size of the array and the
elements in the array. The program then asks the user to enter a
particular index and prints the element at that index.
*/

public class Arrayindex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements in the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the array elements you want to access");
		int pos = sc.nextInt();
		try {
			System.out.println("the array  element at index  " + pos + "=" + a[pos]);
		} catch (Exception e) {
			System.out.println("Exception occured" + e);
		}
		sc.close();
	}
}
