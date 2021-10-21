package newyear;

import java.util.Scanner;

public class Newyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b,c,d,e,i,t;
 Scanner year = new Scanner(System.in);
 t=year.nextInt();
 for(i=0;i<t;i++)
 {
 a = year.nextInt();
 c = a%2020;
 b= a/2020;		
if(c<=b)		
  {
	System.out.println("YES");
  }
else
{
	System.out.println("NO");
     }		
		
	}
	}
}
