package javaassignment;
import java.util.Scanner;
public class IncomeTax {
	double tax;
	public double TaxPayable(int ctc) {
		if(ctc>=0 && ctc<=180000)
			tax=0;
		else if(ctc>=180001 && ctc<=300000)
			tax=(ctc*10)/100;
		else if(ctc>=300001 && ctc<=500000)
			tax=(ctc*20)/100;
		else if(ctc>=500001 && ctc<=1000000)
			tax=(ctc*30)/100;
		return tax;
	}
	public static void main(String[] args) {
		int ctc;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your CTC: ");
		ctc=s.nextInt();
		IncomeTax it=new IncomeTax();
		double tax;
		tax=it.TaxPayable(ctc);
		System.out.println("Tax to be paid: "+tax);
	}
}
