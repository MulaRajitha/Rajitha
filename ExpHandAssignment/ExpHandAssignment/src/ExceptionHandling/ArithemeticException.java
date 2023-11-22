package ExceptionHandling;
import java.util.Scanner;

public class ArithemeticException {
public static void main(String[] args) {
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a ");
	a=s.nextInt();
	System.out.println("enter b ");
	b=s.nextInt();
	try {
		System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println("Divide by zero");
	}
  }
}
