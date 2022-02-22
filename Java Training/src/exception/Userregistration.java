package exception;

/* A student portal provides user to register their profile. During
registration the system needs to validate the user should be located in
India. If not the system should throw an exception.
*/
import java.util.*;

public class Userregistration {

	static public void registeruser() throws Exception {
		String username;
		String countryname;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name and country name :");
		username = s.nextLine();
		countryname = s.nextLine();
		String o = "India";
		s.close();
		if (countryname.equalsIgnoreCase(o)) {
			System.out.println("Registeration done succesfully " + username);
		} else {
			throw new Exception("InvalidCountryException");
		}
	}

	public static void main(String args[]) {
		try {
			registeruser();
		} catch (Exception e) {
			System.out.println("Users outside India cannot register " + e);

		}
	}
}
