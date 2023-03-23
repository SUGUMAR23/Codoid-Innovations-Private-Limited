package java1;

public class task12 {
	public static void main(String[] args) {
		int sum = 0, n1 = 0, n2 = 1, i= 1;
		System.out.print("The first 10 number of fibonacci series are ");
		System.out.println(n1+" ");
		System.out.println(n2+" ");
		while (i<=10) {
			sum = n1+n2;
			n1=n2;
			n2 = sum;
			System.out.print(sum+" ");
			i++;
		}
	}
}
