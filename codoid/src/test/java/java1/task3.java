
////How to remove special characters from a string in java?

package java1;

public class task3 {
	public static void main(String[] args) {
		String str1 = "^(Hello World)^!!! This is String with Special Characters : @#$%&^()";
		
		String str2 = str1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str2);
	}
}
