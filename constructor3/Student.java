package constructor3;

import java.util.Scanner;

public class Student {

	String name,gender;
	int phn;
	void  mathod(String name,String gender,int phn)
	{
		this.name=name;
		this.gender = gender;
		this.phn = phn;
		
		
	}
	void display () {
		
		Scanner scanner = new Scanner(System.in);
		name =scanner.next();
		gender = scanner.next();
		phn = scanner.nextInt();
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone Number : "+phn);
		
		
		
	}

}
