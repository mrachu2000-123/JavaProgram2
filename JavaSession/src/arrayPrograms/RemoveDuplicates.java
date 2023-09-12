package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		RemoveDuplicates.duplicate(ar);
	}

	public static void duplicate(int[] ar) {

//		Arrays.sort(ar);
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]!=ar[i+1]) {
				System.out.print(ar[i]+" ");
			}
		}
		System.out.print(ar[ar.length-1]);

	}
}
