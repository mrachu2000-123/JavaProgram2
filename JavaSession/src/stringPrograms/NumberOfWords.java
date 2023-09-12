package stringPrograms;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(NumberOfWords.wordsCount(str));
	}

	public static int wordsCount(String str) {

		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
	}

}
