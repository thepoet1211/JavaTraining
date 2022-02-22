package controlstatements;

//Program to learn Do WHILE LOOP.
public class Dowhile {

	public static void main(String args[]) {
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("\n\n\tThe sum of 1 to 10 is .. " + sum);
	}
}
