package oops;

public class Overriding {
	 public static void main(String args[])

		{
		 Dog1 b = new Dog1(); //
		 b.move(); // runs the method in Dog class

		}}
	class Animal1 {
		 public void move()

		{
		 System.out.println("Animals can move");

		}
		}
		class Dog1 extends Animal1 {
		 public void move()
		 {
		 System.out.println("Dogs can walk and run");

		}
		}
		
