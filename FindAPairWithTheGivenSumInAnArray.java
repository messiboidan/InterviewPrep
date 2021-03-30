package practicePackage;

import java.util.*;

public class FindAPairWithTheGivenSumInAnArray {
	//3-29-21
	public static void findPairWithGivenSum(int[] arr, int sum) {
		
		//String for return and variables to store two numbers from arr
		String ret = "";
		int firstNum = 0;
		int secondNum = 0;
		
		//double for loop to check each value and save pair if they add up to sum 
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					firstNum = arr[i];
					secondNum = arr[j];
					ret = String.format("Pair found (%d, %d)", firstNum, secondNum);
				}
			}
		}
		
		//message in case no pairs are found
		if(firstNum + secondNum != sum) {
			ret = "Pair not found.";
		}
		System.out.println(ret);
	}
	
	
    // Function to find a pair in an array with a given sum using hashing
	// Most code taken from solution on techiedelight.com, above solution was my attempt
	// I have modified this solution to solve the additional challenge and return all pairs instead of just one.
    public static void findPair(int[] A, int sum)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
 
        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair `(A[i], sum-A[i])` exists
 
            // if the difference is seen before, print the pair
            if (map.containsKey(sum - A[i]))
            {
                System.out.printf("Pair found (%d, %d)", A[map.get(sum - A[i])], A[i]);
                System.out.println();
                
                //remove value so pair doesn't get found twice. 
                map.remove(i);
            }
 
            // store index of the current element in the map
            map.put(A[i], i);
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
 
        findPair(A, sum);
        
		// test findPairWithGivenSum method 		
		int[] testArray = new int[]{10, 2, 0, 5, 7, 4, 1};
		int[] testArray2 = new int[]{0,0,0,0,0};
		
		findPairWithGivenSum(testArray, 12);
		findPairWithGivenSum(testArray2, 12);
		System.out.println("Expected results: Pair found");
		System.out.println("Pair not found.");

    }
	
}
