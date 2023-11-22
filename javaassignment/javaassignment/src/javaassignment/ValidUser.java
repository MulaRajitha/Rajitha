package javaassignment;
import java.util.Scanner;

public class ValidUser 
{
	String uid= "Gracely", pwd="password";
	int Attempt=3;
	public String UserLogin(String Id, String pass)
	{
		if(Id.equals(uid)&& pass.equals(pwd))
			return "yes";
		else
			return "no";
	}
	public static void main (String[] args) 
	{
		ValidUser vu=new ValidUser();
		String uid,pwd;
		Scanner s= new Scanner(System.in);
		int Attempt=0;
		while(true)
		{
			System.out.println("Enter userid: ");
			uid=s.next();
			System.out.println("Enter password: ");
			pwd=s.next();
			String result=vu.UserLogin(uid,pwd);
			if(result.equals("yes"))
			{
				System.out.println("Welcome "+uid);
				break;
			}
			else
			{
				Attempt++;
				if(Attempt==3)
				{
					System.out.println("Contact Admin");
					break;
				}
			}
		}
	}
	

}
