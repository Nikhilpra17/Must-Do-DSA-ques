package com.company.MustDoQues;

import java.util.Arrays;

public class A6 {
	
	// Search an element in a Sorted and Rotated array
	// Do in TC = O(log n)
	
	public static int sortbinary(int [] array, int key) {
		int index=0;
		
		int median = array.length /2 ;
		System.out.println(median);
		
		if (array[0] < median) {
			for (int i =0 ; i< median ; i++) {
				if (key == array[i]) {
					index = i;
					break;
				}
			}
		}else {
					for (int p = median ; p< array.length ; p++) {
						if (key == array[p]) {
							index = p;
							break;
				}
			}
		}
				
		
		
		return index;
	}
	
	
	public static void main(String[] args) {
    	
		 int [] nums = {20, 30, 40, 50 ,60, 5, 10 };
		int n = 5;
		  int indexx = sortbinary(nums, n);
		 
		 System.out.println(indexx);
		 
		 //TC - O(log n)
		 
		 
	    }
	}
