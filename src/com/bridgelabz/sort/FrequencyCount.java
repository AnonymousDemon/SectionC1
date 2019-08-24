package com.bridgelabz.sort;


import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method strub
//
		String str,str2;
		String[] arr;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		str = scanner.nextLine();
		
		arr = str.split(" ",0);
		str2 = arr.toString();
		Utility.printDistinct(str);
		

		

  
		 }

}
