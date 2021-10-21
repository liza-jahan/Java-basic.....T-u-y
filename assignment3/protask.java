package assignment3;

public class protask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product pro1 = new Product();
    		
 pro1.display(123,"main menu","high","black",43.2,20.21,23.00,5000.00);
 Product pro2 = new Product();
 pro2.display(10987,"***Home***","middle","Red",30.04,23.03,11.00,3400.00);
 
 System.out.print("product1 informasion:\n");
 System.out.println("Id number = "+pro1.id);
 System.out.println("Title = "+pro1.title);
 System.out.println("Category = "+pro1.category);
 System.out.println("colour = "+pro1.colour);
 System.out.println("Height = "+pro1.height);
 System.out.println("Width = "+pro1.width);
 System.out.print("Discount = "+pro1.discount);
 System.out.println("NewPrize = "+pro1.newPrize);
 System.out.print("  \n");
 
 System.out.print("product2 informasion:\n");
 System.out.println("Id number = "+pro2.id);
 System.out.println("Title = "+pro2.title);
 System.out.println("Category = "+pro2.category);
 System.out.println("colour = "+pro2.colour);
 System.out.println("Height = "+pro2.height);
 System.out.println("Width = "+pro2.width);
 System.out.print("Discount = "+pro2.discount);
 System.out.println("NewPrize = "+pro2.newPrize);
 System.out.print("  \n");
  

	}

}
