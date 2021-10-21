package assignment2;

public class studenttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student Student2 = new student();
      Student2.appple("cse-r-112456","Eakteker ","jahan","liza","cse" ,1);
      student Student3 = new student();
      Student3.appple("EEE-123467","lauhe","mahfuz","udoy","EEE", 10);
      
      System.out.print("Student2 informasion\n");
      System.out.println("Id number = "+Student2.id);
      System.out.print("student name : "+Student2.firstname);
      System.out.print(" "+Student2.middlename);
      System.out.println(" "+Student2.lastname);
      System.out.println("Depaerment : "+Student2.department);
      System.out.println("Roll = "+Student2.roll);
      System.out.print("   \n");
      
      System.out.println("Student3 informasion\n");
      System.out.println("Id number = "+Student3.id);
      System.out.print("student name : "+Student3.firstname);
      System.out.print(" "+Student3.middlename);
      System.out.println(" "+Student3.lastname);
      System.out.println("Depaerment : "+Student3.department);
      System.out.println("Roll = "+Student3.roll);
      
      
      
      
	}

}
