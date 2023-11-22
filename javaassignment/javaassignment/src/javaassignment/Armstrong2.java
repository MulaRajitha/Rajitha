package javaassignment;

public class Armstrong2{
	
		public static void main(String[] args) {
			int n,r;
			for(n=100;n<=999;n++)
			{
				int temp=n, sum=0;
				while(temp!=0) {
					r=temp%10;
					sum =sum+ r*r*r;
					temp=temp/10;
				}
				if(sum==n)
				System.out.println(n+ "is an armstrong");
			}
		}
}

	