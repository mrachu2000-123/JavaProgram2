package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ReverseString.reverse(str);
	}

	public static void reverse(String str) {

		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
