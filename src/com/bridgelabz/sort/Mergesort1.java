package com.bridgelabz.sort;

import com.bridgelabz.utilityC.sortUtility;

public class Mergesort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        String[] ClassOne = { "Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal" };
	        String[] ClassTwo = { "Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose", "Maria" };
	        String[] names = new String[ClassOne.length + ClassTwo.length];

	        sortUtility.mergeSort(ClassOne);
	        sortUtility.mergeSort(ClassTwo);

	        sortUtility.merge(names, ClassOne, ClassTwo);

	        sortUtility.mergeSort(names);
	        //Arrays.sort(names);

	        for (String ClassThree : names) {
	            System.out.println(ClassThree);
	}

}
}
