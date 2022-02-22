package threading;

public class ThreadPriority {

	public static void main(String args[]) {
		A3 threadA = new A3();
		B3 threadB = new B3();
		C3 threadC = new C3();
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(6);
		threadA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Start Thread A");
		threadA.start();
		System.out.println("Start Thread b");
		threadB.start();
		System.out.println("Start Thread C");
		threadC.start();
		System.out.println("Exit from main thread ");
	}

}

class A3 extends Thread {

	public void run() {
		System.out.println("Thread A Started");
		for (int i = 1; i <= 4; i++) {
			System.out.println("From thread A : I =" + i);
		}
		System.out.println("EXIT FROM A");
	}
}

class B3 extends Thread {

	public void run() {
		System.out.println("Thread B Started");
		for (int j = 0; j <= 4; j++) {
			System.out.println("From thread B : J =" + j);
		}
		System.out.println("EXIT FROM B");
	}
}

class C3 extends Thread {

	public void run() {
		System.out.println("Thread C Started");
		for (int k = 0; k <= 4; k++) {
			System.out.println("From thread C : K =" + k);
		}
		System.out.println("EXIT FROM C");
	}
}