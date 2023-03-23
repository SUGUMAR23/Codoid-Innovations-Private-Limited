package java1;

import java.util.Scanner;

public class task13 {
	public static void main(String[] args) {
		int num ,  rev = 0, x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		int temp =num;
		
		while (num>0) {
			x = num%10;
			rev = rev*10+x;
			num = num/10;
			
		}
		
		if (rev==temp)
		{
			System.out.println("It is Polindrome number");
		}
		else
		{
			System.out.println("It is Not Polindrome number");
		}
	}
}
