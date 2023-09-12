package stringPrograms;

import java.util.Scanner;

public class AlternativeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		AlternativeString.printAlternate(str1, str2);
	}

	public static void printAlternate(String str1, String str2) {

		String str3 ="";
		int i=0, j=0;
		while(i<str1.length() && j<str2.length()) {
			str3 = str3+str1.charAt(i);
			i++;
			str3 = str3+str2.charAt(j);
			j++;
			
		}
		
		while(i<str1.length()) {
			str3 = str3+str1.charAt(i);
			i++;
		}
		
		while(j<str2.length()) {
			str3 = str3+str2.charAt(j);
			j++;
			
		}
		
		System.out.print(str3);
	}
}
