package javaassignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array {
	public static void main(String[] args) throws IOException{
		int a, key, flag=0;
		int value[]=new int[15];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter keys: ");
		for(a=0;a<15;a++)
		{
			value[a]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the key to be searched: ");
		key=Integer.parseInt(br.readLine());
		for(a=0;a<15;a++)
		{
			if(value[a]==key)
             {
				flag=1;
				break;
				}
		}
		if(flag==1)
		{
			System.out.println("Key found");
		}
		else {
			System.out.println("Key not found");
		}
	}

}
