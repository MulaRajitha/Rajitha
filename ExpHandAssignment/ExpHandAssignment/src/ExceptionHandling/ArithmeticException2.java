package ExceptionHandling;
import java.util.Scanner;

public class ArithmeticException2 {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a: ");
		a=s.nextInt();
		System.out.println("enter b: ");
		b=s.nextInt();
		try {
			if(b==0) {
				throw new UnsupportedOperationException();
			}
			else {
				System.out.println(a/b);
			}
		}
		catch(UnsupportedOperationException e){
			System.out.println("exception occured");
			
		}
	}
	

}
