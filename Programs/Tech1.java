package Programs;

import java.util.Scanner;

public class Tech1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		while(num!=0) {
			int n = num % 10;
			count++;
			num = num/ 10;
		}
		System.out.println(count);
	}

}
