package codeforces.com;

import java.util.Scanner;

public class Pazzel {
	public static void main()
	{
	Scanner	smart = new Scanner(System.in);
	int i,n=0,x;
	 int  t, a,b,sum=0,c;
	
		t = smart.nextInt();
		for(i=0;i<t;i++)
		{
			a = smart.nextInt();			b = smart.nextInt();
	 if(a%b==0)
	 {
		 System.out.println("0");
	 }
	 else {
		
		c=a%b;
		sum = b-c;
		 
		System.out.println("%ld"+sum); 
		 
	}
	}

}}
