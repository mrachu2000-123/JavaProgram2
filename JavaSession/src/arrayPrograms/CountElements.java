package arrayPrograms;

import java.util.Scanner;

public class CountElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		CountElements.count(ar);
	}

	public static void count(int[] ar) {

		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			count++;
		}
		System.out.println(count);
	}

}
