package com.operative.fundamental.practise;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check PALINDROME");
		int n = sc.nextInt();
		
		int result = 0, temp = n;
		byte digit;
		
		while( temp != 0) {
			digit = (byte) (temp%10);
			result = (result*10) + digit;
			temp /= 10;
		}
		
		if(result == n)
			System.out.println("Is Palindrome");
		else
			System.out.println("NOT Palindrome");
		
		
	}

}
