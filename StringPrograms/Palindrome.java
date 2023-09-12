package StringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(ispalindrome(s)){
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

	public static boolean ispalindrome(String s) {

		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;j--;
			}else {
				return false;
			}
		}
		return true;
	}

}
