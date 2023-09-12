package stringPrograms;

import java.util.Scanner;

public class CapitalTosmall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		CapitalTosmall.smallToCapital(str);
	}

	public static void smallToCapital(String str) {

		String t = "";
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if(ch>='a' && ch<='z') {
				t = t+(char)(ch-32);
			}else if(ch>='A' && ch<='Z') {
				t = t+(char)(ch+32);
			}else {
				t = t+ch;
			}
		}
		System.out.println(t);
	}

}
