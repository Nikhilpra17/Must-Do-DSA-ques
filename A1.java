package com.company.MustDoQues;

import java.util.ArrayList;

public class A1 {
	
	// Maximum and minimum of an array 
	
	public static void  MAM (int [] a1) {
		int minimum = a1[0];
		int max = a1[0];
		
		for (int i =0 ; i< a1.length; i++) {
			if (a1[i] < minimum) {
				minimum = a1[i];
			}
			if (a1[i] > max) {
				max = a1[i];
			}
		}
		
		System.out.println("Maximum : " + max );
		System.out.println("Minimum : " + minimum );
	}
	
	
	 public static void main(String[] args) {
	    	
		 int [] nums = {1000, 11, 445, 1, 330, 3000};
		 
		 MAM(nums);
		 
		 //TC - O(n)
		 //SC - O(1)
		 
	    }
	}
