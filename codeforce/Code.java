package codeforce;


import java.util.Scanner;



public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		//int a;
		a = scan.nextInt();
		scan.nextLine();
	 String  x,y;
       x = scan.nextLine();
       y  =scan.nextLine();
        int sum=0,i,d;
       for(i=0;i<a;i++) 
       {
    	   int c = Integer.parseInt(Character.toString(x.charAt(i)));
    	    d =Integer.parseInt(Character.toString(y.charAt(i)));
    	sum= sum+ Math.min(10-Math.abs(c-d),Math.abs(c-d));   
    	  
    	   
       }
        System.out.println(sum);
	}

}
