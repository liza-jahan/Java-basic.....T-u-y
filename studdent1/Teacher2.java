package studdent1;

import java.util.Scanner;

public class Teacher2 {

	//private static String a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	
		String x =scan.next();
		String y = scan.next();
		int b    = scan.nextInt();
		Class2 t1;
		t1 = new Class2();
		t1.Class2(x,y,b);
      t1.display();
      Class2 t2=new Class2();
      
      t2.Class2(scan.next(), scan.next(), scan.nextInt());
      t2.display();
      
	}

}
