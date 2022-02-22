package exception;

import java.util.*;
/*Write a program that takes as input the size of the array and the
elements in the array. The program then asks the user to enter a
particular index and prints the element at that index. Index starts
from zero.
This program may generate Array Index Out Of Bounds Exception or
NumberFormatException . Use exception handling mechanisms to handle
this exception.*/

public class Arrayindex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("Enter the length of the array");
		a = s.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the array elements");
		try {
			for (int i = 0; i < a; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println("Enter the index ");
			int y = s.nextInt();
			System.out.println(arr[y]);
		} catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}
		s.close();
	}
}
