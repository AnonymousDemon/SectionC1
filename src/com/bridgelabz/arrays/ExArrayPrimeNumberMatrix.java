package com.bridgelabz.arrays;


import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class ExArrayPrimeNumberMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int m=scanner.nextInt();

		System.out.print("Enter the number of columns : ");
		int n=scanner.nextInt();

		// 2D array for storing 'm*n' prime numbers
		int A[][]=new int[m][n];

		// 1D array for storing 'm*n' prime numbers
		int B[] = new int [m*n];

		// For taking natural numbers
		int i = 0, j;
		int k = 1; 

		// for iD Array.
		while(i < m*n)
		{
			if(Utility.isPrime(k)==true)
			{
				B[i] = k;
				i++;
			}
			k++;
		}

		// for 2D Array.
		int x = 0;
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				A[i][j] = B[x];
				x++;
			}
		}

		// printing the result in 2D Array.
		System.out.println("The Final Array is : ");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
