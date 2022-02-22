package threading;

public class Extendable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1= new A1();
		B1 b1 = new B1();

	
		a1.start();
		b1.start();
		System.out.println("Exit from main -----------------");
	}
}

class A1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" FROM A ----- " + i);
		}
		System.out.println("EXIT A ---------------------");

	}
}

class B1 extends Thread {
	public void run() {
		for (int J = 0; J < 5; J++) {
			System.out.println(" FROM B ----- " + J);
		}
		System.out.println("EXIT B ---------------------");

	}
}

