package practicePackage;

import java.util.*;

public class SockSorting {

	/* Task - create a function that counts pairs of socks
	 * Takes input of int[] each int represents a color of sock
	 * If two ints are identical it means they represent the same color.
	 * Must count number of pairs and return that int. 
	 * 
	 */
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        
    	// initialize counter for return
    	int pairs = 0;
    	
    	// hashset to store one sock of each color
        HashSet<Integer> h = new HashSet<Integer>();
        
        // loop to iterate through the array
        for (int i = 0; i < n; i++){
            
        	// add the current sock to the hashset if it is not already inside
        	if(!h.contains(ar[i])){
                h.add(ar[i]);
            }
            //remove sock from hashset and make pair if it is already inside
        	else{
                h.remove(ar[i]);
                pairs++;
            }
            
        }
        //return the number of socks.
        return pairs;
    }
}