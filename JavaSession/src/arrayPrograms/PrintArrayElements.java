package arrayPrograms;

import java.util.Scanner;

public class PrintArrayElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		PrintArrayElements.elements(ar);
	}

	public static void elements(int[] ar) {
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
