package OOPsAssignment;

import java.util.Scanner;
class SavingsAccount{
	int total=0;
	public int savings(int amount) {
		return total+amount;
	}
}
class Fixed{
	int total=0;
	public int deposit(int amount) {
		return total+amount;
	}
}

public class BankAccount
{
	public static void main(String args[])
	{
		System.out.println("Enter your choice: ");
		Scanner s= new Scanner(System.in);
		String a=s.nextLine();
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		SavingsAccount sav=new SavingsAccount();
		Fixed fix= new Fixed();
		if(a.equals("Savings")) 
		{
			int c=sav.savings(b);
			System.out.println(c);
		}
		else if(a.equals("Fixed"))
		{
			int d=fix.deposit(b);
			System.out.println(d);
		}
	}

}
