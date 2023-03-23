//Write a Java program to print stars using for loop, where the number of stars printed should be equal to the row number?

package java1;

public class task6 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
