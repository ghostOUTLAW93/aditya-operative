package com.operative.fundamental;

import java.util.Arrays;
import java.util.Objects;

public class Test  {



	public static void main(String[] args) {

	      int n = 10;
	        int[][] matrix = new int[n][n];
	        
	        int value = 1;
	       
	   
	        
	        for(int i = 0; i <= Math.ceil(n/2); i++) {
	            
	            int x = i, y = i;
	            int yTR = n-1-i;
	            int xBR = n-1-i;
	            int yBL = 0 + i;
	            int xTL = 0 + i;
	            
	            while(y <= yTR) {
	                matrix[x][y++] = value;
	                value++;
	            }
	            y--;
	            
	            while(x < xBR) {
	                matrix[++x][y] = value;
	                value++;
	            }
	            
	            while(y > yBL) {
	                matrix[x][--y] = value;
	                value++;
	            }
	            
	            while(x > xTL + 1) {
	                matrix[--x][y] = value;
	                value++;
	            }
	            
	        }
	        
	        for(int[] i : matrix) {
	            for(int j : i) {
	                System.out.print(j + "  ");
	            }
	            System.out.println();
	        }
	        
	        
	    }
	                  
}




