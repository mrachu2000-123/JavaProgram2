package StringPrograms;

import java.util.Scanner;

public class CharacterIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char k = sc.next().charAt(0);

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==k) {
				System.out.println(i);
				break;
			}
		}
	}

}
