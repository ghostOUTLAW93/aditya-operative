package com.operative.fundamental.practise;

import java.util.Scanner;

public class Prime {

	public static void checkPrime() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for checking PRIME");
		int n = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 2; i < n/2; i ++) {
			if(n%i == 0) {
				flag = false;
				break;
			}
				
		}
		if(flag == true)
			System.out.println("No. is Prime");
		else
			System.out.println("No. is NOT Prime");
		
		
		
	}

}
