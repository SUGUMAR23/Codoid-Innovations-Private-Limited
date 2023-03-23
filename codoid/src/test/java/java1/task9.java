////How to check Odd and Even Number in java.


package java1;

public class task9 {
	public static void main(String[] args) {
		System.out.print("The Even numbers are ");
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();	
		System.out.print("The Odd Numbers are ");
		for (int j = 1; j <=10; j++) {
			if (j%2!=0) {
				System.out.print(j+" ");
			}
		
		}
	}
}
