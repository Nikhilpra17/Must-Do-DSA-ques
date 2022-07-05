package com.company.MustDoQues;

import java.util.*;

public class A5 {
	// Chocolate Distribution Problem
	
			
			public static int chocolate(int[] nums, int A) {
		        
		        Arrays.sort(nums);
				int end = A-1;
				int start = 0;
				int minidiff = nums[nums.length -1];
				while (end < nums.length) {
					int diff = nums[end] - nums[start];
					if (diff < minidiff) {
						minidiff = diff;
					}
					end ++;
					start ++;
					
				}
		        
		        
		        return minidiff;
		        
		    }
			
			
			 public static void main(String[] args) {
			    	
				 int [] nums = {12, 4, 7, 9, 2, 23, 25, 41,30, 40, 28, 42, 30, 44, 48, 43, 50};
				 int size = 7;
				 
				 int resu = chocolate(nums, size);
				 
				 System.out.println(resu);
				 
				 //TC - O(n)
				 //SC - O(1)
				 
			    }


	}

