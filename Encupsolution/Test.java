package person;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person ();
		
		Scanner scanner = new Scanner(System.in);
		String x,y;
		int a;
		System.out.println("ENTER ANY NUMBER :");
		x = scanner.nextLine();
		a=scanner.nextInt();
		p1.SetName(x);
		System.out.println("Name : "+p1.getName());
		p1.setPhone(a);
		
		System.out.println("Phone : "+p1.getPhone());
		
		
	}

}
