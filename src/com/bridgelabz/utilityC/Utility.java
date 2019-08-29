package com.bridgelabz.utilityC;

import java.util.Arrays;
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
    	
    	/**
    	 * @param num
    	 * @return
    	 */
    	public static double harmonicSeries(int num) {
    		double sum = 1;
    		if (num == 1) {
    			return 1.0;
    		} else {
    			for (int i = 2; i <= num; i++) {
    				sum = sum + ((double) 1 / i);
    			}
    			return sum;
    		}

    	}

    	/**
    	 * @return
    	 */
    	public static int rollDice() {
    		Random random = new Random();
    		return (int) random.nextInt(6) + 1;// 1 to 6
    	}
    	
    	/**
    	 * @param num1
    	 * @return
    	 */
    	public static boolean isPalindrome(int num1) {
    		int sum = 0;
    		int r;
    		int temp = num1;
    		if (num1 <= 10) {
    			return false;
    		} else {
    			while (num1 > 0) {
    				r = num1 % 10;
    				sum = (sum * 10) + r;
    				num1 = num1 / 10;
    			}
    			if (temp == sum)
    				return true;
    			else
    				return false;

    		}

    	}


    	/**
    	 * @param num1
    	 * @param num2
    	 * @return
    	 */
    	public static boolean isAnagram(int num1, int num2) {
    		String str1, str2;
    		str1 = String.valueOf(num1);
    		str2 = String.valueOf(num2);
    		if (str1.length() != str2.length()) {
    			return false;
    		} else {
    			char[] ch1 = new char[str1.length()];
    			for (int i = 0; i < ch1.length; i++) {
    				ch1[i] = str1.charAt(i);
    			}
    			char[] ch2 = new char[str2.length()];
    			for (int i = 0; i < ch2.length; i++) {
    				ch2[i] = str2.charAt(i);
    			}
    			Arrays.sort(ch1);
    			Arrays.sort(ch2);

    			if (Arrays.equals(ch1, ch2)) {
    				return true;
    			} else {

    				return false;
    			}
    		}

    	}
    	
    	public static String[] shuffleCardsDeck(String[] arr) {
    		Random random = new Random();
    		int f1, f2;
    		String temp;
    		for (int i = 0; i < 52; i++) {
    			f1 = random.nextInt(51);
    			f2 = random.nextInt(51);
    			if (f1 != f2) {
    				temp = arr[f1];
    				arr[f1] = arr[f2];
    				arr[f2] = temp;
    			}
    		}
    		return arr;

    	}
    	
    	/**
    	 * @param arr
    	 * @return
    	 */
    	public static int findRepeatedInArray(int[] arr) {
    		for (int i = 0; i < arr.length; i++) {
    			for (int j = i + 1; j < arr.length; j++) {
    				if (arr[i] == arr[j]) {
    					return arr[i];
    				}
    			}
    		}
    		return 0;
    	}
    	
    	public void gamling(int stake, int goal, int day) {
    		int tempstake = stake;
    		int win = 0;
    		int loss = 0;
    		for (int i = 0; i < day; i++) {
    			while (tempstake > 0 && tempstake < goal) {
    				if (Math.random() < 0.5) {
    					tempstake++;
    					win++;
    				} else {
    					tempstake--;
    					loss++;// lose
    				}
    				if (tempstake == goal) {
    					win++;
    				}
    			}
    		}

    		int arr[][] = new int[2][1];
    		arr[0][0] = win;
    		arr[1][0] = loss;

    		System.out.println("the number of times the game won is " + arr[0][0]);
    		System.out.println("The number of times the game loss is " + arr[1][0]);

    	}
    	    
    	/**
    	 * @param i
    	 * @return
    	 */
    	public static int powerOfTwo(int i) {
    		return (int) Math.pow(2, i);

    	}
    	
    	/**
    	 * @param range
    	 * @return
    	 */
    	public static int randomNumber(int range) {
    		Random random = new Random();
    		return (int) random.nextInt(range) + 1;// 1 to 6
    	}
    	    	    
}
