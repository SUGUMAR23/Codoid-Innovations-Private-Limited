////Print Multiplication table Program in java

package java1;

public class task10 {
	public static void main(String[] args) {
		System.out.println("The Second Multiplication table is ");
		
		for (int i = 1; i < 15; i++) {
			int sum =i;
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+"*"+j+"="+sum*j);
			}
			
		}
	}
}
