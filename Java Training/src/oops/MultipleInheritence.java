package oops;

public class MultipleInheritence {
	public static void main(String args[]) {
		CProg obj = new CProg();
		obj.input();
		obj.output();
		obj.area();
		obj.volume();
		obj.area2();
		obj.volume1();
		obj.area12();
	}
}

interface Test {
	final int d = 22;

	abstract public int area();

	abstract public int volume();
}

interface Test2 {
	final int d = 25;

	public int area2();
}

class B {
	public void input()

	{
	 System.out.println("This is an input method");

	}

	public void output()

	{
	 System.out.println("This is an outputmethod");

	}
}

class CProg extends B implements Test, Test2 {
	int i, j;
	//function
	public int area() {
		i = 10;
		j = 20;
		return i * j;
	}

	//function
	public int volume() {
		return (i * j * 22);
	}
	//function
	public int area2()

	{
	 System.out.println("Area 2 is a method of Test2 interface");
	 return i*j;

	}
	//function
		public int volume1()
		{
		 System.out.println("Value of d in test interface "+Test.d);
		System.out.println("Value of d in test2 interface "+Test2.d);
		return (i*j*22) ;
		}
		//function
		public void area12()
		 {
		 System.out.println("Area 2 is a method of Test2 interface ");
		 }
		}
	

