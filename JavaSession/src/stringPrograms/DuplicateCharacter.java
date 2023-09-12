package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] ch = str.toCharArray();

		DuplicateCharacter.duplicate(ch);

	}

	public static void duplicate(char[] ch) {

		Arrays.sort(ch);

		int count = 1;
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i] == ch[i+1]) {
				count++;
			}else {
				if(count>=2) {
					System.out.println(ch[i]+" "+count);
					count = 1;
				}
			}
		}
		if(count>=2) {
			System.out.println(ch[ch.length-1]+" "+count);
		}
	}
}
