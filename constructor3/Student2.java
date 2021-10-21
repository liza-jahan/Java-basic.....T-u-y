package constructor3;

import java.util.Scanner;

import com.sun.jdi.Method;

public class Student2  extends Student{
  String qualification;
 
  
//  void display2() {
		
	//  display();
	
	// }
	
  void play() {
	   Scanner scanner2 = new Scanner(System.in);
	 qualification = scanner2.nextLine();
	 display();
	  System.out.println("Qualification : "+qualification);
	  
	  
  }

	
	
}
