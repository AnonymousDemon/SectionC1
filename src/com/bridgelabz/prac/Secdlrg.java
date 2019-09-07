package com.bridgelabz.prac;

import java.util.Arrays;

public class Secdlrg {

	public static int getSecondLargest(int[] a, int total){  
		Arrays.sort(a); 
		return a[total-2];
		}  

	public static int getSecondMinimum(int[] a, int total)
	{  
		Arrays.sort(a); 
		return a[1];
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,21,9,8,7,6,5,4,3,2,10};
	
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
		System.out.println("Second Minimum: "+getSecondMinimum(a,a.length));  

	}

}
