package com.operative.fundamental.practise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no to find FACTORIAL");
		int n = sc.nextInt();
		
		System.out.print("FACTORIAL of " + n + " is ");
		int result = 1;
		while(n >= 1) {
			result *= n;
			n--;
		}
		
		System.out.println(result);
		
		
	}

}
