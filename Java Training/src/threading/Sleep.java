package threading;

public class Sleep {
	public static void main(String args[]) {
		Thread t = new Thread();
		t.currentThread();
		System.out.println("Current thread is ----------------" + t);
		t.setName("my thread");
		System.out.println("after name change thread is ----------------" + t);
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);}
				
			}
		catch(Exception e) {
			System.out.println("INTERUPTED----------------------");
		}
	}

}
