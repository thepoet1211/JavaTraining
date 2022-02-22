package string;

//program to learn the equals function.
public class PublicBooleanEquals {
	public static void main(String[] args) {
		String str1 = "Hello Dear";
		String str2 = "Hello Dear";
		String str3 = new String("Hello Dear");
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 are identical strings");
		} else {
			System.out.println("str1 and str2 are non identical");
		}
		if (str1 == str2) {
			System.out.println("Str1 Str2 refer to same string");
		} else {
			System.out.println("Str1 Str2 refer to different strings");
		}
		if (str1.equals(str3)) {
			System.out.println("str1 and str3 are identical");
		} else {
			System.out.println("str1 and str 3 are non identical");
		}
		if (str1 == str3) {
			System.out.println("Str1 and str3 are same ");
		} else {
			System.out.println("str1 and str3 are not the same");
		}
	}

}
