
//Write a Java Program to print the below output: * 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567

package java1;

public class task7 {
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			System.out.print("* ");
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.print(" ");
		}
	}
}
