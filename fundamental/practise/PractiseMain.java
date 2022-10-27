package com.operative.fundamental.practise;

import java.util.Scanner;

public class PractiseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);

		int rep = 1;

		while(rep !=0)
		{
			System.out.println("------------------------"
					+ "\nPlease enter the choice"
					+ "\n1. Check PRIME"
					+ "\n2. Print FIBONACCI SERIES"
					+ "\n3. SWAP two numbers"
					+ "\n4. FACTORIAL"
					+ "\n5. Check ARMSTRONG"
					+ "\n6. Check PALINDROME"
					+ "\n7. Check STRING PALINDROME"
					+ "\n0. Press 0 to EXIT!"
					+ "\n------------------------");
			int choice = obj.nextInt();
			
			

			switch(choice) {

			case 1:
				Prime.checkPrime();
				break;

			case 2:
				Fibonacci.main(null);
				break;

			case 3:
				Swap.main(null);
				break;

			case 4:
				Factorial.main(null);
				break;

			case 5:
				Armstrong.main(null);
				break;

			case 6:
				Palindrome.main(null);
				break;

			case 7:
				StringPalindrome.main(null);
				break;

			case 0:
				System.out.println("Exited succesfully!!");
				rep = 0;
				break;

			default:
				System.out.println("Enter the valid choice");

			}
		}

	}
}
