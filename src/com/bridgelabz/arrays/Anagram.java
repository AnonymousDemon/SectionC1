package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		String x="";
		int m=scanner.nextInt(),sum=0;
		if(Utility.isPrime(m)==true) {
			System.out.println(m);
			int temp =m;
			while(m>0) {
				int a = m%10;
				x = x + "" +a;
				m=m/10;
			}
			int k = Integer.parseInt(x);
			if(Utility.isPrime(k)==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
		else
		{
			System.out.println("not prime");

		}
	}

}
