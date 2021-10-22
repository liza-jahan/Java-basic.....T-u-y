package static_method;



public class Student {

	String name;
	int id;
	static String universityName= "DIU";
	
	Student(String name,int id)
	{
		this.name=name;
		this.id =id;
		
		
	}
	void display() {
       System.out.println("Name; "+name);
       System.out.println("Id : "+id)	;
		
	   System.out.println("University : "+universityName);	
		System.out.print("\n");
		
	}
	
	
	
	
}
