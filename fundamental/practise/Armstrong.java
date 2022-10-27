package com.operative.fundamental.practise;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no to perform Armstrong");
		String s = sc.next();
		
		int noOfDigit = s.length();
		int n = Integer.parseInt(s);
		int digit = 0, result = 0, num = n;
		
		while(n != 0) {
			digit = n%10;
			result += (int) Math.pow(digit, noOfDigit);
			n /= 10;
		}
		
		if(result == num)
			System.out.println("Armstrong No.");
		else
			System.out.println("NOT an Armstrong no.");
		
		

	}

}
