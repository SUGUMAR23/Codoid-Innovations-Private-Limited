
//Write a Java program to show a NullPointerException.

package java1;

public class task5 {
	public static void main(String[] args) {
		String str = null;
	    int length = str.length();
	    System.out.println("Length of the string is: " + length);
	}
}
