// CS 2110 in-class activity starter code. 

import java.util.Scanner; // import statement for Scanner

// Class: OneDArrayActivity
public class OneDArrayActivity {

	// The "main" method 
	public static void main(String[] args) {
		
		// Setting up a Scanner to read user input from the keyboard 
		Scanner keyboard = new Scanner(System.in);
		// Prompting the user for the size of the array
		System.out.println("How many values do you want in the array?");
		// Reading the number entered in at the keyboard
		int x = keyboard.nextInt();
		
		// Create an int array called "values" of size 'x' (same as number entered 
		int[] values = new int[x];
		
		// for-loop that starts at the beginning of the array and allows you to 
		// input array values one by one. 
		for(int i = 0; i < x; i++){
			System.out.println("Enter the " + i + " value in the array");
			// read the number entered and store it in the ith position in the array (values) 
			values[i] = keyboard.nextInt(); 
		}
		
		
		// for-loop that prints out the contents of the "values" array
		for(int j = 0; j < values.length; j++){
			System.out.print(values[j] + " ");
		}
		
		// YOUR SOLUTION TO THIS IN-CLASS ACTIVITY GOES HERE. NO NEED TO CHANGE ANYTHING ABOVE.
		// determine if input array is increasing, each value in array is larger than previous value (except for first one)
		// print something to the console indicating whether the array is increasing or not
		//Input your code here: 
		for(int i : values){
			int y = i; int z = i+1; 
			while ( z > y );
				//iterate through
				if( z < y);
				system.out.print("The array isn't increasing!");
				break;
				
				if(i = x);
				system.out.print("The Array is increasing!");
		}
	
	
	
        // It's important to remember to close the Scanner using the close() method	
		// (No need to change this at all, keep this as the last line of your code)
		keyboard.close();
	
	} // END main

} // END Class 
