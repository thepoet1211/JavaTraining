package oops;

public class Super {
	public static void main(String args[])

	{
	 Dog b = new Dog(); 
	 b.move(); 
	b.sum();
	}
	}


class Animal {
	 public void move()

	{
	 System.out.println("Animals can move");
	 

	}
	 public void sum()
	 {
		 System.out.println(2+3);
	 }
	}
	class Dog extends Animal {
		Dog(){
			super.sum();
		}
	 public void move()

	{
	 super.move(); 
	 System.out.println("Dogs can walk and run");
	 

	}
	 public void sum()
	 {
		 System.out.println(1+3);
	 }
	}
	
	 