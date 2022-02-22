//assignment 1 using Linked List
package collectionassgn;
import java.util.*;
public class Linledlist {
	

	
		public static void main(String[] args) {
			Arr1 j = new Arr1();
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

	class Arr1 {
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();

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


