package ArrayPrograms;

import java.util.Scanner;

public class SumEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int k = sc.nextInt();
		
		sumPair(ar,k);
	}

	public static void sumPair(int[] ar, int k) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]+ar[j] == k) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
