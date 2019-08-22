package com.bridgelabz.Search;

import java.util.Scanner;

public class Old {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= 
				"Old MacDonald had a farm,\n" + 
				"E­I­E­I­O.\n" + 
				 "And on his farm he had some ANIMAL,\n" + 
				"E­I­E­I­O.\n" + 
				"With a SOUND, SOUND here,\n" + 
				"And a SOUND, SOUND there,\n" + 
				"Here a SOUND, there a SOUND,\n" + 
				"Everywhere a SOUND, SOUND,\n" ;
			
		System.out.println(str);
		String ani;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		ani = scanner.nextLine();
		
		if(ani.equals("chick")) {
			str = str.replaceAll("ANIMAL", "Chick");
			str = str.replaceAll("SOUND", "chick");
		}
		System.out.println(str);
		if(ani.equals("cat")) {
			str = str.replaceAll("ANIMAL", "cat");
			str = str.replaceAll("SOUND", "meow");
		}
		System.out.println(str);
		if(ani.equals("Duck")) {
			str = str.replaceAll("ANIMAL", "Duck");
			str = str.replaceAll("SOUND", "quack");
		}
		System.out.println(str);
		if(ani.equals("Mule")) {
			str = str.replaceAll("ANIMAL", "Mule");
			str = str.replaceAll("SOUND", "Heehaw");
		}
		System.out.println(str);
		if(ani.equals("Turkey")) {
			str = str.replaceAll("ANIMAL", "Turkey");
			str = str.replaceAll("SOUND", "gobble");
		}
		System.out.println(str);
		if(ani.equals("dog")) {
			str = str.replaceAll("ANIMAL", "Dog");
			str = str.replaceAll("SOUND", "bow wow");
		}
		System.out.println(str);
		if(ani.equals("pig")) {
			str = str.replaceAll("ANIMAL", "Pig");
			str = str.replaceAll("SOUND", "oink oink");
		}
		System.out.println(str);
		if(ani.equals("turtle")) {
			str = str.replaceAll("ANIMAL", "Turttle");
			str = str.replaceAll("SOUND", "nerp nerp");
		}
		System.out.println(str);
		if(ani.equals("cow")) {
			str = str.replaceAll("ANIMAL", "Cow");
			str = str.replaceAll("SOUND", "moo, moo");
		}
		System.out.println(str);
		
	}

}
