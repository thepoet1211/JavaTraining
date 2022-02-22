package threading;

public class Runnabl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ThreadA = new A();
		B ThreadB = new B();

		Thread a1 = new Thread(ThreadA);
		Thread b1 = new Thread(ThreadB);
		a1.start();
		b1.start();
		System.out.println("Exit from main -----------------");
	}
}

class A implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" FROM A ----- " + i);
		}
		System.out.println("EXIT A ---------------------");

	}
}

class B implements Runnable {
	public void run() {
		for (int J = 0; J < 5; J++) {
			System.out.println(" FROM B ----- " + J);
		}
		System.out.println("EXIT B ---------------------");

	}
}