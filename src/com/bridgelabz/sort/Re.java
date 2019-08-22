package com.bridgelabz.sort;

import java.util.Scanner;

public class Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name,fulln;
		int no,cno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your full name");
		fulln = sc.nextLine();
		System.out.println("Enter your mobile no");
		no = sc.nextInt();
		System.out.println("Hello " +name+ " We have your full name as \n" +fulln+ " inour system."+"your contact no is +91-" +no+" . Please let us know in case pof any clarificaton\n");
	}

}
