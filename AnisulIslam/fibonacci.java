package AnisulIslam;

import java.util.Scanner;



public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int first=0 ,sec=1,n,fibo,i;
        n = input.nextInt();
        System.out.print(first+ " "+sec);
        for(i=3;i<n;i++)
        {
        	fibo = first+sec;
        	System.out.println("Result= "+fibo);
        	first = sec;
        	sec = fibo;
        }
      System.out.println("\n");  
	}

}
