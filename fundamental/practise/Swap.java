package com.operative.fundamental.practise;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers to be SWAPPED");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Numbers before Swap are: " + num1 + " " +num2);
		
		System.out.println("\nEnter the choice\n1. Swap using two variables"
				+ "\n2. Swap using three variables");
		byte choice = sc.nextByte();
		
		switch(choice) {
		
		case 1:
			twoVarSwap(num1,num2);
			break;
			
		case 2:
			threeVarSwap(num1,num2);
			break;
			
			default:
				System.out.println("Enter the valid option");
		
		}
		
		
		
	}

	private static void threeVarSwap(int n1, int n2) {
		// TODO Auto-generated method stub
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		
		System.out.println("The numbers after swap are: " + n1 + " " + n2);
	}

	private static void twoVarSwap(int n1, int n2) {
		// TODO Auto-generated method stub
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("The numbers after swap are: " + n1 + " " + n2);

		
	}

}
