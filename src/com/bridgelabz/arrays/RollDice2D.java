package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class RollDice2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int range;
		System.out.println("enter how many times dice the roll");
		range = scanner.nextInt();//20
		int[][] arr=new int[2][6];
		/*
		 * ------
		 * ------
		 */
		for (int i = 0; i < 6; i++) {
			arr[0][i]=i+1;
			arr[1][i]=0;
		}
		/*
		 * 123456
		 * 000000
		 */
		int rolled;
		for (int i = 0; i < range; i++) {
			rolled=Utility.rollDice();//2
			switch(rolled) {
			case 1:
				arr[1][0]+=1;
				break;
			case 2:
				arr[1][1]+=1;
				break;
			case 3:
				arr[1][2]+=1;
				break;
			case 4:
				arr[1][3]+=1;
				break;
			case 5:
				arr[1][4]+=1;
				break;
			case 6:
				arr[1][5]+=1;
				break;
			}
			
		}
		//printing array
		System.out.println("dice number");
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[0][i]+" ");
		}
		System.out.println();
		System.out.println("Count occurence");
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[1][i]+" ");
		}
		scanner.close();

		
	}

}
