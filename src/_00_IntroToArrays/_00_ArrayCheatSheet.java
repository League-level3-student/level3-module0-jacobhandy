package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String s[] = {"This", "is", "a", "Java", "test"};
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2] = "the";
		//4. print the third element again
		System.out.println(s[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int a = 0; a < s.length; a++) {
			String x = s[a];
			System.out.println(x);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println(s.length);
		//7. make an array of 50 integers
		int x[] = new int[50];
		//8. use a for loop to make every value of the integer array a random number
			Random rng = new Random();
			for(int i = 0; i < x.length; i++) {
				x[i] = rng.nextInt(100) + 1;
			}
		//9. without printing the entire array, print only the smallest number on the array
			int min = 100;
			int max = 0;
			for(int i = 0; i < x.length; i++) {
				if(x[i] < min) min = x[i];
				if(x[i] > max) max = x[i];
			}
			System.out.println(min);
			for(int i = 0; i < x.length; i++) {
				System.out.println(x[i]);
			}
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		System.out.println(max);
		//12. print only the last element in the array
		System.out.println(x[49]);
		
	}
}
