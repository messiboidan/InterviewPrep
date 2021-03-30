package practicePackage;

public class ValleyCounter {
    
	
	// Challenge from hackerrank.com
	// Write a function that takes string input containing Ds and Us and returns the number of valleys a hiker entered
	// D represents an elevation change of -1. U = +1
	// hiker must start and end at sea level
	
	public static int countingValleys(int steps, String path) {
        
        //variables to track current elevation and number of valleys
        int elevation = 0;
        int valleyCount = 0;
        
        //For loop to iterate through String path
        for(int i = 0; i < steps; i++){
            
            //Character at current location
        	char thisStep = path.charAt(i);
            
        	//note change in elevation
            if(thisStep == 'D'){
                elevation = elevation - 1; 
            }
            else{
                elevation++;
            }
            
            // increment valleyCount if hiker just entered a valley.
            if(elevation == -1 && thisStep == 'D'){
                valleyCount++;
            }
        }
        
        return valleyCount;
    }	
}
