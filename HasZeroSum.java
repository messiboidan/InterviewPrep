package practicePackage;

import java.util.*;

public class HasZeroSum {

	
	//method to check if an array contains a subarray with a sum of 0
	//returns "Contains 0-sum Subarray" if true
	public static void zeroSumCheck(int[] arr) {
		//Initialize set to store sums
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		
		//add value 0 in case subarray starts a 0
		set.add(0);
		
		//for loop to check each value in the array
		//updates sum and prints true if set already contains that sum  
		for(int i: arr) {
			
			sum += i ;
			
			if(set.contains(sum)) {
				System.out.println("Contains 0-sum subArray.");
				return;
			}
			else {
				set.add(sum);
			}
			
		}
		System.out.println("Doesn't contain 0-sum subArray");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//should be false
		int[] test = new int[] {1,2,3,4,5,6,7};
		zeroSumCheck(test);
		
		//should be true
		int[] test2 = new int[] {1,2,-3,4,5,6,7};
		zeroSumCheck(test2);

	}

}
