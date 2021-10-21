package com.liza.problem;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	//	String commandString = scanner.nextLine();
		int person =0;
		
		while (true) {
			person++;
			if(person%2==0) {
				person =0;
			}
			if(person ==1) {
				System.out.println("Niha :");
			}else {
				System.out.println("Liza :");
			}
			System.out.println(scanner.nextLine());
			
			
		}

	}

}
