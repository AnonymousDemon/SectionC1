package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Collections;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> arraylist = new ArrayList<String>();
		    arraylist.add("Apple");
		    arraylist.add("Banana");
		    arraylist.add("Pear");
		    arraylist.add("Mango");

		    /*Unsorted List: ArrayList content before sorting*/
		    System.out.println("ArrayList Before Sorting:");
		    for(String str: arraylist){
		   System.out.println(str);
		  }

		    /* Sorting in decreasing (descending) order*/
		    Collections.sort(arraylist, Collections.reverseOrder());

		    /* Sorted List in reverse order*/
		    System.out.println("ArrayList in descending order:");
		    for(String str: arraylist){
		   System.out.println(str);
		    }
	}

}
