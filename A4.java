package com.company.MustDoQues;

import java.util.Arrays;
import java.util.HashSet;

public class A4 {
	
	// Contains Duplicate in Strings or in Array
	
		// Method 1st (Using HashSet)
		
		public boolean containsDuplicate(int[] nums) {
	        boolean result= false;
	        
	        HashSet<Integer> hm = new HashSet<>();
			
			for (int i = 0 ; i< nums.length; i++) {
				if (hm.contains(nums[i]) == true) {
					return true;
				} else {
				hm.add(nums[i]);
				}
			}
	        
	        
	        return result;
	        
	    }
		
		// Method 2nd (Using Sort and differences)
		
		public boolean containsDuplicate(int[] nums) {
	        boolean result= false;
	        
	        Arrays.sort(nums);
	            int start =0;
	        for (int i =1 ; i<nums.length; i++){
	            if ((nums[i] - nums[start]) == 0){
	                return true;
	            }
	            start ++;
	        }
	        return result;
	        
	    }
		
		
		 public static void main(String[] args) {
		    	
			 int [] nums = {1000, 11, 445, 1, 330, 3000};
			 
			 MAM(nums);
			 
			 //TC - O(n)
			 //SC - O(1)
			 
		    }
		}


}
