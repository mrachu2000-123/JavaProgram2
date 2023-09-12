package Programs;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		String s3 ="";
		for(int i=0;i<str1.length();i++) {
 			if(str1.charAt(i)==' ') {
// 				for(int j=0;j<str2.length();j++)
				s3 = s3+str2;
			}else {
				s3 = s3+str1.charAt(i);
			}
		}
		System.out.println(s3);
	}

}
