package StringPrograms;

import java.util.Scanner;

public class LongestSentenceCount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] str = new String[n];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = scan.nextLine();
			
		}
		
		longestSentenceCount(str);
	}

	public static void longestSentenceCount(String[] str) {

		int temp =0;
		for (int i = 0; i < str.length; i++) {
			int count =0;
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j)==' ') {
					count++;
				}
			}
			if(temp<count) {
				temp = count;
			}
		}
		
		System.out.println(temp+1);
	}

}
