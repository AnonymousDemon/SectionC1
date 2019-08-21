package com.bridgelabz.Search;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,q ;
		
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        q = scanner.nextInt();
        y= (int) Math.pow(2, q);
        int lo =0,hi=y-1,mid=(lo+hi)/2;
        System.out.println("lo= "+lo+ "mid = " +mid+ "hi= " +hi);
        int key;
        System.out.println("enter a key to find");
        key = scanner.nextInt();
        for(int i=0;i<q;i++)
        {
        	
        }
        
	}

}
