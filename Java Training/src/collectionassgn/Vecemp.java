package collectionassgn;

/*Write a program that will have a Vector which is capable of
storing emp objects. Use an Iterator and enumeration to list
all the elements of the Vector.*/

import java.util.*;

public class Vecemp {
	public static void main(String[] args) {
		Employee5 j = new Employee5(1, "parth", 2300);
		EmployeeDB4 O = new EmployeeDB4();
		O.addEmployee(j);
		Employee5 k = new Employee5(2, "partho", 2340);
		O.addEmployee(k);
	}
}

class Employee5 {
	String name;
	int eCode;
	int salary;

	public Employee5(int eCode, String name, int salary) {

		this.eCode = eCode;
		this.name = name;
		this.salary = salary;

	}
}

class EmployeeDB4 {
	Vector<Employee5> al = new Vector<>();

	boolean addEmployee(Employee5 e) {

		al.add(e);

		Iterator<Employee5> iter = al.iterator();

		while (iter.hasNext()) {
			Employee5 t = (Employee5) iter.next();
			System.out.println("empid:"+ t.eCode);
			System.out.println("name: "+t.name);
			System.out.println("salary: "+t.salary);
		}

		return true;
	}
}