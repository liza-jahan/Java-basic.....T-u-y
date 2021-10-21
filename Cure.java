package CFinsomniacure;

import java.util.Scanner;

public class Cure {

	public static void main(String[] args) {
		Scanner cure = new Scanner(System.in);
		int k,l,m,n,d,sum=0;
		k = cure.nextInt();
		l = cure.nextInt();
		m = cure.nextInt();
		n = cure.nextInt();
		d = cure.nextInt();
		for(int i =1;i<=d;i++)
		{
			if(i%k==0 || i%l==0 || i%m==0 || i%n==0 )
			{
				sum++;
			}
		}
        System.out.println(+ sum);
	}

}
