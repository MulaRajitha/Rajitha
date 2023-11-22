package javaassignment;
import java.io.*;

public class Grades {
	public static void main(String[] args)throws IOException
	{
		int s1,s2,s3;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter C Marks: ");
		s1=Integer.parseInt(br.readLine());
		System.out.println("Enter C++ Marks: ");
		s2=Integer.parseInt(br.readLine());
		System.out.println("Enter Java Marks: ");
		s3=Integer.parseInt(br.readLine());
		
		
		System.out.println(" C: "+s1);
		System.out.println(" C++: "+s2);
		System.out.println(" Java: "+s3);

		if(s1>60 && s2>60)
		{
			if(s3>60)
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("PROMOTED");
			}
		}
		else {
			System.out.println("FAILED");
		}
	}
}
