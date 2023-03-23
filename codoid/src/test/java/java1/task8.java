
//Find duplicate elements in a string

package java1;

public class task8 {
	public static void main(String[] args) {
		String str = "Banana";
		char[] str1 = str.toCharArray();
		System.out.print("The duplicate elements in the given String is :");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str1[i]==str1[j]) 
					System.out.print(str.charAt(i));
					
			}
		}
		
	}	
}
