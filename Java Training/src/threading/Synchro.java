package threading;

public class Synchro {
	public static void main(String[] args) {
		Account a = new Account();
		Takeoutmoney o = new Takeoutmoney();
		o.t = 100;
		o.start();
		Takeoutmoney y = new Takeoutmoney();
		y.t = 2000;
		y.start();
		Takeoutmoney j = new Takeoutmoney();
		j.t = 100;
		j.start();

	}
}

class Account {
	public static int bal = 2000;

	synchronized public void withdraw(int amount) {
		if (amount <= bal) {
			bal = bal - amount;
			System.out.println(amount + " Withdrawn, remaining balance is " + bal);

		} else {
			System.out.println("Not suffecient balance");

		}
	}
}

class Takeoutmoney extends Thread {
	static Account withd=new Account();
	int t;

	public void run() {
		
		withd.withdraw(t);
	}}

