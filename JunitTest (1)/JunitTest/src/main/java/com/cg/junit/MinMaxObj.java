package com.cg.junit;

public class MinMaxObj {

public String findMaxMin(int arr[]) {

int min=arr[0];
int max=arr[0];
for(int i=0; i<arr.length; i++) 
{
if(arr[i]<min)

min=arr[i];

else if(arr[i]>max)

max=arr[i];
}
String str="";
str+= Integer.toString(min)+Integer.toString(max);

return str;
}
	
}

 
	
