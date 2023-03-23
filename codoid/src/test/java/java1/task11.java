
////How to replace string with another string in java Program
package java1;

public class task11 {
	public static void main(String[] args) {
		
		String str1 = "Null Krishna Null Krishna Krishna Krishna Null Null";
		String str2 = "Hare Null Hare Null Null Null Hare Hare";
		
		String str11 = str1.replaceAll("Null", "Hare");
		String str22 = str2.replaceAll("Null", "Rama");
		System.out.println(str11);
		System.out.println(str22);
	}
}
