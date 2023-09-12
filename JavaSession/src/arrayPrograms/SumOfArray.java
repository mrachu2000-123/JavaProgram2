package arrayPrograms;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		SumOfArray.sum(ar);
		
	}

	public static void sum(int[] ar) {
		
		int sum =0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		System.out.println(sum);
	}

}
