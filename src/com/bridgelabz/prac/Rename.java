package com.bridgelabz.prac;

import java.util.Scanner;

public class Rename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		str = sc.nextLine();
		System.out.println("Enter the name you want to replace");
		str2 = sc.nextLine();
//		char[] ch = str.toCharArray();
//		char[] ch2 = str2.toCharArray();
		str =str.replaceAll(str,str2);
		System.out.println("After replacing\n"+str);
		
	}

}
