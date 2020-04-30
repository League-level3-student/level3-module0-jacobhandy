package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] lol = {"baldy", "baldy", "why", "so", "maldy"};
		
		//reverseStrings(lol);
		//everyOtherString(lol);
		//randomOrder(lol);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
		static void reverseStrings(String joe[]) {
			for(int a = joe.length -1; a> 0; a--) {
				System.out.println(joe[a]);
			}
		}
	
	
	static //4. Write a method that takes an array of Strings and prints every other String in the array.
		void everyOtherString(String logan[]) {
			for(int a = 0; a < logan.length; a++) {
				if(a % 2 == 0) {
					System.out.println(logan[a]);
				}
			}
		}
	
	static //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
		void randomOrder(String baldy[]) {
			for(int a = 0; a < baldy.length; a++) {
				Random r = new Random();
				System.out.println(baldy[r.nextInt(baldy.length)]);
			}
		}
	
}
