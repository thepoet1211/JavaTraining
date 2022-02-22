package controlstatements;

//Program to learn the Break statement.
public class Break {

	public static void main(String args[]) {
		int i = 1;
		while (i <= 10) {
			System.out.println("\n" + i);
			i++;
			if (i == 5) {
				break;
			}
		}
	}
}
