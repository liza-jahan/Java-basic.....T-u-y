package Java;

import java.util.ArrayList;

public class liza2 {
	
	public static void main(String[] args)
	{ArrayList<String>	fruits = new ArrayList<>();
	
	fruits.add("mango");
	fruits.add("banana");
	fruits.add("orange");
	fruits.add("melon");
	String plach = fruits.get(3);
	
	int listsize = fruits.size();
	fruits.set(1,"water melon");
	System.out.println(fruits);
		
		
	}

}
