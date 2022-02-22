/*
Create an ArrayList which will be able to store only Strings.
Create a printAll method which will print all the elements
using an Iterator.
*/
package collectionassgn;

import java.util.*;
import java.util.Iterator;

public class Stringm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();

		int n;
		System.out.println("Enter the numbre of strings you want to add");
		n = s.nextInt();
		System.out.println("Enter the strings ");
		for (int i = 0; i < n; i++) {
			String p = s.next();
			a.add(p);
		}
		s.close();
		Iterator<String> iter = a.iterator();
		System.out.println(a);
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
