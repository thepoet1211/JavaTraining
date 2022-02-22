package assignment1;

//Program to learn all the operators
public class Operators {

	static void operator1() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int rem = 10 % 20;
		System.out.println("Sum of a and b " + sum);
		System.out.println("Subtraction of a and b " + sub);
		System.out.println("Multiplication of a and b " + mul);
		System.out.println("Division of a and b " + div);
		System.out.println("Modulus of a and b " + rem);
	}

	static void operator2() {
		int a = 40;
		int b = 50;
		System.out.println("Value of a " + a);
		System.out.println("Value of b " + b);

		System.out.println("Value of --a " + (--a));
		System.out.println("Value of a " + a);
		System.out.println("Value of b-- " + (b--));
		System.out.println("Value of b " + b);
	}

	static void operator3() {

		int a = 10;
		int b = 20;
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("b >= a = " + (b >= a));
		System.out.println("b <= a = " + (b <= a));
	}

	static void operator4()

	{
		boolean a = true;
		boolean b = false;
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!(a && b) = " + !(a && b));
	}

	static void operator5() {

		int X = 12, Y = 13, Z = 16;
		System.out.println("The Assignment Value is : ");
		X += 2;
		Y -= 2;
		Z *= 2;
		System.out.println("The Value of X is : " + X);
		System.out.println("The Value of Y is : " + Y);
		System.out.println("The Value of Z is : " + Z);
	}

	static void operator6() {
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
	}

	static void operator7() {
		int a = 5;
		int b = 7;
		System.out.println("a&b = " + (a & b));
		System.out.println("a|b = " + (a | b));
		System.out.println("a^b = " + (a ^ b));
		System.out.println("~a = " + ~a);
		a &= b;
		System.out.println("a= " + a);
	}

	public static void main(String args[]) {
		System.out.println("addition,subraction\n");
		operator1();
		System.out.println("\n");
		System.out.println("increment decrement\n");
		operator2();
		System.out.println("\n");
		System.out.println("relational\n");
		operator3();
		System.out.println("\n");
		System.out.println("logical\n");
		operator4();
		System.out.println("\n");
		System.out.println("shorthand assgn\n");
		operator5();
		System.out.println("\n");
		System.out.println("ternary\n");
		operator6();
		System.out.println("\n");
		System.out.println("bitwise\n");
		operator7();
		System.out.println("\n");

	}
}
