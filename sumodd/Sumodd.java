package sumodd;

import java.util.Scanner;



public class Sumodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
  long  a,b,t,i,c,sum=0;

 t = scan.nextLong();
 for(i=0;i<t;i++)
 {
	a= scan.nextLong();
	b = scan.nextLong();
	sum= a+b;
	if(a>=b*b)
 {
	if(sum%2==0)	
	{
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
 }	
	else {
		System.out.println("NO");
	}	
	}
	}
}
