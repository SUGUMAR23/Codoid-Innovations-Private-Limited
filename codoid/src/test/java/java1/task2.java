////How to find duplicate characters in a string in Java?

package java1;

public class task2 {
	public static void main(String[] args) {
		String str = "calculator";
	    char[] carray = str.toCharArray();
	    System.out.println("The string is:" + str);
	    System.out.print("Duplicate Characters in above string are: ");
	    for (int i = 0; i < str.length(); i++) {
	       for (int j = i + 1; j < str.length(); j++) {
	          if (carray[i] == carray[j]) {
	             System.out.print(carray[j] + " ");
	             
	          }
	       }
	    }
	}
}
