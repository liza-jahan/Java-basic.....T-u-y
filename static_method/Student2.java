package static_method;

import java.util.Scanner;



public class Student2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		String name = scan.nextLine();
		int id = scan.nextInt();
         Student s1 =  new Student(name,id);
         Student s2 = new Student(scan.next(),scan.nextInt());
         s1.display();
         s2.display();
	}
	

}
