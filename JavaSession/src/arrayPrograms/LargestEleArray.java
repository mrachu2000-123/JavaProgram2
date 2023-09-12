package arrayPrograms;

import java.util.Scanner;

public class LargestEleArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		LargestEleArray.largestElement(ar);

	}

	public static void largestElement(int[] ar) {

		int max =Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {

			if(ar[i]>max) {
				max =ar[i];
			}
		}
		System.out.println(max);
	}
}
