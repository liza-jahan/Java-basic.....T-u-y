package oop1;

import java.util.Scanner;


public class Moni {
	// class r variable er name emon keno?

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// there is a error. b'coz we called a empty constructor. but our Teacher class
		// has not any empty constructor
		// let me input the parameter of constructor

		String t1Name = scan.nextLine();
		String t1GenderString = scan.nextLine();
		// look at there, int type has a range.
		int a = 1501; // till now ok// but now, I crossed the limit of int type. OK?
		// so phone number feild can not take more then 10 digit
		int t1PhoneNumber = scan.nextInt();
		// Not I will give parameter of constructor
		Teacher teacher = new Teacher(t1Name, t1GenderString, t1PhoneNumber);

		teacher.display();
//		but what happen, when i write note then 10 digit for phone number? that will be input mismatch exception. OK?

		// now the code looks very clea.

//		now let me create another object of teache.
		// here I am not taking any variable for parameter. I am directly calling
		// scanner method as a parameter
		// scan.nextLine() method return a string valur on the other hand 
		String t2Name = scan.next();
		String t2GenderString = scan.next();
		// look at there, int type has a range.
		int t2Number = 1501;
		Teacher teacher2 = new Teacher(t2Name, t2GenderString,t2Number);
		teacher2.display();
		
	}//ai lh

}
