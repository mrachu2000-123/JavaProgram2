package Programs;

import java.util.Scanner;

public class Tech2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = "";
		for (int i = str1.length()-1; i >=0; i--) {
			 str2 = str2 +str1.charAt(i);
		}
	    System.out.println(str1);
	    System.out.println(str2);
	    int count = 0;
	    
	    for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				count++;
			}
		}
	    System.out.println(count);
	}

}
