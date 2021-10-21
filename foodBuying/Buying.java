package foodBuying;

import java.util.Scanner;

public class Buying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int t;
		
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt();
		for(int i =1;i<=t;i++)
	
		{
			int a,b,ans =0,d;
		 a= scan.nextInt();
		while(a!=0)
		 {
		 d =(a/10)*10;
		   ans = ans + d;
		   b = a-d;
		 
		    a = (a/10)+b;
		    if(a<10)
		    {
		     ans = ans+a;
		     break;
		 
			 
			  }
		}
		 System.out.println(ans);
			
		}
			
		}


	}


