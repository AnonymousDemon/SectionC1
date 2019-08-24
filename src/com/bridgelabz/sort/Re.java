package com.bridgelabz.sort;

import java.util.Scanner;

public class Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name,fulln,
		 no,cno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your full name");
		fulln = sc.nextLine();
		System.out.println("Enter your mobile no");
		no = sc.nextLine();
		System.out.println("Hello " +name+ " We have your full name as \n" +fulln+ 
				" inour system."+"your contact no is +91-" +no+ " "
						+ " Please let us know in case pof any clarificaton\n" +
				"Thank you BridgeLabz " );
		String r1 = name.replaceAll(name, "Vikas");
		String r2 = name.replaceAll(fulln, "Vikas bhardwaj");
		String r3 = name.replaceAll(no, "9126378217");
		

		
	}

}
