package com.operative.fundamental.practise;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
				System.out.println("Enter the *STRING* to check PALINDROME");
		String s = sc.next();

		int i = 0;
		int j = (s.length()-1);

		boolean check = true;
		for(; i <= j; i ++) {
			if(s.charAt(i) != s.charAt(j)) {
				check = false;
				break;
			}
			else
				j--;

		}

		if(check == false)
			System.out.println("NOT a Palindrome");
		else
			System.out.println("IS a Palindrome");


	}

}


