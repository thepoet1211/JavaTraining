package collectionassgn;

import java.util.*;

public class Country {
	public static void main(String[] args) {
		Coun t = new Coun();
		t.addcount("India", "Delhi");
		t.getCapital("India");
		t.getCountry("Delhi");
	}
}

class Coun {
	HashMap<String, String> map = new HashMap<>();

	void addcount(String country, String Capital) {
		map.put(country, Capital);

	}

	void getCapital(String country) {
		if (map.containsKey(country)) {

			// Mapping
			String a = map.get(country);

			// Printing value fr the corresponding key
			System.out.println("Capital of " + country + " is:- " + a);

		}
	}

	void getCountry(String capital) {
		if (map.containsValue(capital)) {

			// Mapping
			String a = map.get(capital);

			// Printing value fr the corresponding key
			System.out.println(capital + " is the Capital of :- " + a);

		}
	}}
