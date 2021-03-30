package practicePackage;

public class CloudJump {
    
	/*
	 * Write a function that finds the shortest path through a binary array
	 * Can't land on 1s
	 * Can either jump forward 1 or 2 indexes
	 * 
	 */
	
	static int jumpingOnClouds(int[] c) {
        
		// initialize counter for number of jumps and return
        int jumps = 0;
        
        //for loop that progresses player through the array
        for(int location = 0; location < c.length - 1; location ++){
            
            // if user can double-jump, do it. Else, single-jump.
            // increment jumps either way
            // increment location if double jump works.
            if(location < c.length - 2 && c[location + 2] == 0){
                location ++;
                jumps ++;
            }
            else{
                jumps++;
            }
        }
        
        // return total number of jumps
        return jumps;

    }
}
