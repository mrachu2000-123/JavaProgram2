package stringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(Palindrome.isPal(str));
	}

	public static String isPal(String str) {

		int i = 0, j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}

}
