package s2_01_APFR04;

import java.util.Arrays;

public class ArrayTester {

	
	
	
/* 
// RETURN FALSE
	static int[][] arr2D = { {0, 1, 2},
					  {3, 4, 5},
					  {6, 7, 8},
					  {9, 5, 3} };
*/
	
	
/*
// RETURN TRUE
	static int[][] arr2D = {{1, 2, 3},
			  				{2, 3, 1},
			  				{3, 1, 2} };
*/

	

	/*
	// RETURN TRUE
		static int[][] arr2D = {{5, 7, 6},
				  				{6, 5, 7},
				  				{7, 6, 5} };
	*/
	
	
/*
// RETURN TRUE
	static int[][] arr2D = {{10, 30, 20, 0},
			  				{0, 20, 30, 10},
			  				{30, 0, 10, 20},
			  				{20, 10, 0, 30} };
*/
	
	
	

// RETURN FALSE
	static int[][] arr2D = {{1, 2},
			  				{1, 2}};

	/**
	 * Returns an array containing the elements of column c of arr2D in the same
	 * order as they appear in arr2d
	 * Precondition: c is a valid column index in arr2D
	 * Postcondition: arr2D is unchanged 
	 */
	
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] result = new int[arr2D.length];
		
		for (int r = 0; r < arr2D.length; r++) {
			result[r] = arr2D[r][c];
		}
		return result;
	}
	
	/**
	 * Returns true if and only if every value in arr1 appears in arr2
	 * Precondition: arr1 and arr2 have the same length
	 * Postcondition: arr1 and arr2 are unchanged
	 */
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean retro = true;
		int k =0;
		for (int i = 0; i < arr1.length; i ++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					k+=1;
				}
			
			
			}
			
		}
		if (k == arr1.length) {
			retro = true;
		}
		else {
			retro = false;
		}
		return retro;
		
	}

	/**
	 * Returns true if arr contains any duplicate values;
	 * 		false otherwise
	 */

	public static boolean containsDuplicates(int[] arr) {
		boolean retro = false; 
		if (arr.length > 2) {
			
		}
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] == arr[i+1]) {
				retro = true;
			}
			else {
				retro = false; 
			}
		}
		if (retro == false){
		}
		else {
		}
		return retro; 
		
	}

	/**
	 * Returns true if square is a Latin square as described in part b;
	 * 		false otherwise 
	 * Precondition: square has an equal number of rows and columns 
	 * 				 square has at least one row
	 */

	public static boolean isLatin(int[][] square) {
		if (containsDuplicates(square[0])) {
			return false;
			}
		for (int r = 1; r < square.length; r++) {
			if (!hasAllValues(square[0], square[r])) {
				return false;
			}
		}
		for (int c = 0; c < square[0].length; c++) {
			if (!hasAllValues(square[0], getColumn(square, c))) {
				return false;
			}
		}
		return true;
		}
		
	
	
	
	public static void main(String[] args) {
		boolean latinSquare = ArrayTester.isLatin(arr2D);
		System.out.println(latinSquare);
	}

}


