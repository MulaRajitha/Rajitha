package javaassignment;

import java.util.Scanner;

public class SimpleCompuntIntrest {
	public static double SI(double p, int t, double r)
	{
		double si;
		si=(p*t*r)/100;
		return si;
	}
	public static double CI(double p,int t, double r)
	{
		double ci;
		ci=(p*(Math.pow((1+(r/100)), t)))-p;
		return ci;
	}
	public static void main(String[] args)
	{
		double p,r;
		int t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		p=s.nextDouble();
		System.out.println("Enter time in number of years: ");
		t=s.nextInt();
		System.out.println("Enter rate of intrest: ");
		r=s.nextDouble();
		System.out.println("Simple intrest: "+ SI(p,t,r));
		System.out.println("Compund intrest: "+ CI(p,t,r));
	}
}
