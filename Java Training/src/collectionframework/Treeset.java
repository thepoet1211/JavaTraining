package collectionframework;

import java.util.TreeSet;
import java.util.Iterator;

public class Treeset {

	public static void main(String args[]) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Zody");
		tree.add("Remiel");
		tree.add("Reggie");
		tree.add("Philippe");
		Iterator iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
