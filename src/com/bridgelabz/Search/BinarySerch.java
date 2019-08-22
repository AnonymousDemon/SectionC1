package com.bridgelabz.Search;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;


public class BinarySerch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] strArr=null;
		try {
			File file=new File("/home/slot2/Desktop/myfile.txt");
			FileReader raf = new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(raf);
			Scanner scanner = new Scanner(System.in);
			 String str  ;

			 
			 while ((str=bufferedReader.readLine()) != null) 
			 {
				strArr=str.split(",");
			 } 
			
			 System.out.println("unsorted =");
			 for (int i = 0; i < strArr.length; i++)
			 {
				 System.out.println(strArr[i]);	
			 }
			 Arrays.sort(strArr);
			 System.out.println("Sorted =");

			 for (int i = 0; i < strArr.length; i++)
			 {
				 System.out.println(strArr[i]);	
			 }
			 String str2;
			 System.out.println("Enter a charcater to search" );
			 str2 = scanner.nextLine();
			int result = Utility.binarySerch(strArr,  str2);
			 if (result == -1) 
		            System.out.println("Element not present"); 
		        else
		            System.out.println("Element found at "
		                              + "index " + result); 

			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
