package ArrayPrograms;

import java.util.Scanner;

public class PrintPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		pairsArray(ar);
	}

	public static void pairsArray(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}

}
