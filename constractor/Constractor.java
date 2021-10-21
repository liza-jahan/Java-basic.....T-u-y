package constractor;

public class Constractor {
 
	String name,gender;
	int phone;
	
 Constractor() {
	
	{
	System.out.println("No found!");	
	}
		
	}///aita constructor
	
	 Constractor(String a,String b,int c) {
	
		name = a;
		gender = b;
		phone = c;
		
		
	}
	
	void display() {
		
		
	System.out.println("Name = "+name);	
	System.out.println("Gender = "+gender);
	System.out.println("Phone = "+phone);	
	System.out.print("\n");	
		
	}

}
