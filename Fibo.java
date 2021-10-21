package Anisulislam;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     int first =0,i,n,sec=1,fibo=0;
     n = input.nextInt();
     System.out.print(first + " "+ sec);
	for (int j = 0; j <n; j++) {
		fibo = first + sec;
		System.out.print(" "+fibo);
		first = sec;
		sec = fibo;
	}
		System.out.println(" ");
	}

}
