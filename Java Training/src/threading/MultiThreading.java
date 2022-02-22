package threading;

public class MultiThreading {
	
	public static void main(String args[]) {
	
		
		Hare obj = new Hare();
		obj.start();
		Tortoise o = new Tortoise();
		o.start();
		obj.setPriority(10);
		o.setPriority(4);
		if(o.u!=0) {
			obj.stop();
		}
		if(obj.p!=0) {
			o.stop();
		}}}

class Hare extends Thread {
	public int p=0;
	public void run() {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("The Hare has completed " + i + " metres.");
			if (i == 60) {
				try {
					Thread.sleep(1000);
				}

				catch (Exception e) {
					System.out.println(e);
				}
			}}
			System.out.println("The Hare has won the race");
			p++;
			
			
			
		
	}}

	class Tortoise extends Thread {
		public int u=0;
	public void run()
	{
	for(int j=1;j<=100;j++)
	{
		System.out.println("The TOrtoise has completed "+j+" metres.");
	}
	
	u++;
	System.out.println("The tortoise has won the race ");}
	}
