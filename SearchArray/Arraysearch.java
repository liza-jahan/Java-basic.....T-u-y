package SearchArray;

import java.util.Scanner;

public class Arraysearch {
	
	
	
	static int jahan(int arr[],int searchEle)
	{
		boolean t=false;
		int i;
		for(i= 0;i<=arr.length;i++)
		{
			if(arr[i]==searchEle)
			{
				return i;
			}
		}
	
		return -1;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]={	20,30, 40 ,80,19};
	
	int searchEle;
	Scanner search = new Scanner(System.in);
	System.out.print("Enter any number : ");
	searchEle = search.nextInt();
	//arr=  search.nextInt();
	int x= jahan(arr,searchEle);	
	 if	(x!=-1)
	 {
	 System.out.print("Found at"+x);
	 }
	 else {
		System.out.print("Not Found");
	 }
	}

}
