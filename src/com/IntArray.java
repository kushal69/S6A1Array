package com;

//	Main Class
public class IntArray {
	//	Main Function
	public static void main(String[] args) {
		int[] intarr = new int[10]; 							// Declaring an integer array of size 10
		int i;
		
		for (i = 1; i < 11; i++) { 							// Initializing values from 1 - 10 to the above array
			intarr[i - 1] = i;
		}
		
		System.out.println("Even numbers within the integer array with elements from 1 to 10 are");
		
		for (i = 0; i < 10; i++) {								//	Loop to displays even numbers in the array		
			if (intarr[i] % 2 == 0) { 							//	Logic to check the even numbers in the array by having the mod of the number in array with 2
				System.out.println(" " + intarr[i]);			//	if the  result is zero then it is the even number
			}
		}
	}
}