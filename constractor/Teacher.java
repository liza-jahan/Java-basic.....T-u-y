package constractor;

import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {

		String a,b;
		int x;
		Scanner scan = new Scanner(System.in);
	    String aName = scan.next();
		String bGender = scan.next();
		int xPhn = scan.nextInt();
		Class1 teacher1 = new Class1(aName, bGender, xPhn);
		teacher1.display();
		
		Class1 teacher2;
		String gender;
		teacher2 = new Class1(aName,bGender,xPhn);
		teacher2.name=" udoy";
		teacher2.gender = "male";
		teacher2.phn =  1785598707;
		teacher2.display();
		
		

	}

}
