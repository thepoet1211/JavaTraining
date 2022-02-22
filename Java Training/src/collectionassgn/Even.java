/*
 Develop a java class with a method saveEvenNumbers(int N)
using ArrayList to store even numbers from 2 to N, where N is a
integer which is passed as a parameter to the method
saveEvenNumbers().
The method should return the ArrayList (A1) created. In the
same class create a method printEvenNumbers()which iterates
through the arrayList A1 in step 1, and It should multiply
each number with 2 and display it in format 4,8,12….2*N. and
add these numbers in a new ArrayList (A2).
The new ArrayList (A2) created needs to be returned. Create a
method printEvenNumber(int N) parameter is a number N. This
method should search the arrayList (A1) for the existence of
the number ‘N’ passed. If exists it should return the Number
else return zero.Hint: Use instance variable for storing the
ArrayList A1 and A2.
NOTE: You can test the methods using a main method.
 */
package collectionassgn;

import java.util.*;

public class Even {
	public static void main(String[] args) {
		Arr j = new Arr();
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = s.nextInt();

		j.saveevennum(n);
		j.doublen();
		System.out.println("Enter the value you want to check");
		int y;
		y = s.nextInt();
		j.check(y);
		s.close();
	}

}

class Arr {
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();

	void saveevennum(int n) {
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				a.add(i);
			} else {
			}

		}
		System.out.println("intial arraylist: " + a);
	}

	void doublen() {
		Iterator<Integer> iter = a.iterator();
		while (iter.hasNext()) {
			int o = 2 * iter.next();
			b.add(o);
		}
		System.out.println("final arraylist: " + b);

	}

	void check(int N) {
		Iterator<Integer> iter = b.iterator();
		int count = 0;
		while (iter.hasNext()) {

			if (N == iter.next()) {
				System.out.println(N + " exists ");
				count++;
			}

			else {

			}
		}
		if (count == 0) {
			System.out.println(N + " Does not exist");
		}

	}
}
