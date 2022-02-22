import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args)
    {   int result=0;
        int count=0;
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x = scan.nextInt();
        scan.close();
        for(int temp=x;temp!=0;count++) {
        	temp=temp/10;
        }
        for(int temp=x;temp!=0;temp=temp/10) {
        	int remainder=temp%10;
        	result+=Math.pow(remainder,count);
        }
        if(x==result) {
        	System.out.println("TRUE");
        	
        }
        else {
        	System.out.println("False");
        }
    }
}

