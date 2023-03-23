////Write Java program that checks if two arrays contain the same elements.

package java1;

import java.util.Arrays;

public class task4 {
	public static void main(String[] args) {
		// Initializing the first array
	    int c[] = { 1, 2, 3 };

	    // Initializing the second array
	    int b[] = { 1, 2, 3};

	   
	    boolean result = Arrays.equals(c, b);

	    // condition to check whether the result is true or false
	    if (result == true) {
	        System.out.println("Two arrays are equal");
	    }
	    else {
	        System.out.println("Two arrays are not equal");
	    }
	}
}
