package com.bridgelabz.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class CouponModif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int range;
		System.out.println("enter how many times generate coupons");
		range = scanner.nextInt();
		int[] arr=new int[range];
		
		int coupon;
		for (int i = 0; i < range; i++) {
			coupon = Utility.randomNumber(range);// 2
			arr[i]=coupon;

		}
		//Array sorting
		Arrays.sort(arr);
		
		//printing distinct numbers from array
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>(); 
        for (int i = 0; i < arr.length; i++) { 
            hashMap.put(arr[i], i); 
        } 
        // Using hashMap.keySet() to print output reduces time complexity.
        System.out.println(hashMap.keySet());
		
		
		scanner.close();
	}

}
