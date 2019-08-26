package com.bridgelabz.utilityC;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	
	public static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
	/**
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int binarySerch(String[] arr, String x) 
    { 
		 int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
    } 
	
	static final int NO_OF_CHARS = 256; 
	/* Print duplicates present in the passed string */
    /**
     * @param str
     */
    public static void printDistinct(String str) 
    { 
        // Create an array of size 256 and count of 
        // every character in it 
        int[] count = new int[NO_OF_CHARS]; 
       
        /* Count array with frequency of characters */
        int i; 
        for (i = 0; i < str.length(); i++) 
            if(str.charAt(i)!=' ') 
                count[(int)str.charAt(i)]++; 
        int n = i; 
       
        // Print characters having count more than 0 
        for (i = 0; i < n; i++) 
            if (count[(int)str.charAt(i)] == 1) 
                System.out.print(str.charAt(i)); 
    } 
   	// Function to check a number is prime or not
    	/**
    	 * @param n
    	 * @return
    	 */
    	public static boolean isPrime(int n) 
    	{
    		int c = 0;
    		for(int i = 1; i<=n; i++)
    		{
    			if(n%i == 0)
    				c++;
    		}
    		if(c == 2)
    			return true;
    		else
    			return false;
    		
    	}
    	
    	public static void magicNumber(int range) {
    		Scanner scanner = new Scanner(System.in);
    		int li = 0;
    		int hi = range - 1;
    		int mi = (li + hi) / 2;

    		System.out.println();
    		System.out.println("Think of a number in your mind between 0 to " + (range - 1));

    		while (li < hi) {
    			System.out.println("if your number is between " + li + " to " + mi + " Press 1 ");
    			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

    			int uservalue = scanner.nextInt();
    			if (uservalue == 1) {

    				hi = mi;
    				mi = (li + hi) / 2;

    			} else if (uservalue == 2) {
    				li = mi+1;
    				mi = (li + hi) / 2;
    			} else {
    				System.out.println("Wrong input ");
    			}
    		}

    		System.out.println("Your number is :" + mi);
    		scanner.close();

    	}
    	    
    	    	    
}
