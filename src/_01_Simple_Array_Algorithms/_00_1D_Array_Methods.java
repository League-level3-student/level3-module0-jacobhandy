package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int x = 0;
		for(int a = 0; a < values.length; a++) {
			x += values[a];
		}
		return x;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		double x = 0;
		for(int a = 0; a < values.length; a++) {
			x += values[a];
		}
		return x/values.length;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean joe = false;
		for(int a = 0; a < array.length; a++) {
			if(array[a] == value) {
				joe = true;
			}
		}
		if(joe == true) {
			return true;
		}
		else {
		return false;
	}
	}
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int z;
		int joe = -1;
		for(int a = 0; a < arr.length; a++) {
			if(arr[a] == value) {
				joe = a;
				break;
			}
			else {
				joe = -1;
			}
		}
		return joe;
		
	}
}
