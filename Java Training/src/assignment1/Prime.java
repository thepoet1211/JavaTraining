package assignment1;

//Program To Print all the prime numbers present between 1 and 100.
public class Prime {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0 && i != 1) {
				System.out.println(i);
			}
		}

	}
}
