package arrayassignment;

import java.util.Scanner;

//To find the maximum and minimum value of an array.
public class MaxMin {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of the length of the array: ");
		n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the numbers of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			s.close();
		
		}
	int y=arr[0];
	int k=arr[0];
	for(int j=1;j<n;j++)
	{
		if(y<arr[j])
		{
			y=arr[j];
		}
		if(arr[j]<k)
		{
			k=arr[j];
		}
		
	}
	
	System.out.println("The maximum value is "+y+" The minimum value is "+k);
	}

}
