package com.company.MustDoQues;

import java.util.*;

public class A2 {
	
	// Program to reverse an array or string
	
	public static int[] reverse(int[] A) {
		 int start = 0;
		 int end = A.length -1;
		 
		 while (start<end) {
			 int temp =0;
			 temp = A[start];
			 A[start] = A[end];
			 A[end] = temp;
			 
			 start ++;
			 end --;
		 }
		 
		 return A;
	}
	
	public static void main(String[] args) {
    	
		 int [] nums = {1000, 11, 445, 330, 3000};
		int [] neww = new int[nums.length];
		 neww = reverse(nums);
		 
		 System.out.println(Arrays.toString(neww));
		 
		 //TC - O(n)
		 
		 
	    }
	}

