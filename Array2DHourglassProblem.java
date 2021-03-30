package practicePackage;

import java.io.*;
import java.util.*;

public class Array2DHourglassProblem{


    //function to find greatest sum of numbers in an hourglass shape in 6x6 2d array. 
	// 0 0 0 x x x
	// x 0 x x x x
	// 0 0 0 x x x
	// x x x x x x
	// x x x x x x
	// x x x x x x
	// above can show the requirement for "hourglass" 
    static int hourglassSum(int[][] arr) {
        
    	// int to store the sum
    	int sum = 0;
    	
    	// for loops that iterate through 2d array and calculates the sum of numbers in the hourglass shape.
        for(int i = 0; i < arr.length -2; i++){
            for(int j = 0; j < arr[i].length - 2; j++){
                
            	//calculate sum
            	int hourglassSum = arr[i][j] + arr[i][j+1] +arr[i][j+2] +arr[i+1][j+1] +arr[i+2][j] +arr[i+2][j+1] +arr[i+2][j+2]; 
                
            	//update sum if current hourglass > sum
            	if(hourglassSum > sum){
                    sum = hourglassSum;
                }
            }
        }
        return sum;

    }

    //code to test the above method. Made by Hackkerrank above function passed tests on website
    //main method throws nullPointerException when run in eclipse.
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }

	        int result = hourglassSum(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
}
