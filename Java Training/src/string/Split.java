package string;

//program to learn the split function.
public class Split {

	public static void main(String[] args) {

		String s = "Welcome to my world";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
