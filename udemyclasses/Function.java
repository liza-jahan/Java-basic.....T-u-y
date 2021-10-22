package udemyclasses;

import java.util.Scanner;

public class Function {
	
	static int l(int a,int b)
	{ 
		int result;
		result = a+b;
		System.out.print(result);
		return result;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		int x ,d,f;
		Scanner scan = new Scanner(System.in);
		d =scan.nextInt();
		f =scan.nextInt();
		
		l(d, f);

	

}
}