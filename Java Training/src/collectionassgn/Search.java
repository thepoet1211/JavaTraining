/*Create an ArrayList of Employee( id,name,address,sal) objects
and search for particular Employee object based on id number.*/
package collectionassgn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Search {
	public static void main(String[] args) {
	Employee2 P=new Employee2(123,"parth",2000,"chandigarh");
	EmployeeDB1 O=new EmployeeDB1();
	O.addEmployee(P);
	O.search(123);
}}

class Employee2 {
	String name;
	int eCode;
	int salary;
	String address;

	public Employee2(int eCode, String name, int salary, String address) {

		this.eCode = eCode;
		this.name = name;
		this.salary = salary;
		this.address = address;

	}

	public int getId() {
		return eCode;

	}
}

class EmployeeDB1 {
	List<Employee2> al = new ArrayList<>();

	boolean addEmployee(Employee2 e) {

		al.add(e);
		return true;
	}

	

	void search(int r) {
		Iterator<Employee2> iter = al.iterator();
		System.out.println("SEARCHING");
		while (iter.hasNext()) {
			Employee2 e=iter.next();
			if (e.getId() == r) {
				System.out.println("Found, details are: ");
				System.out.println("empid:"+ e.eCode);
				System.out.println("name: "+e.name);
				System.out.println("salary: "+e.salary);
			}
		}	
		}

}