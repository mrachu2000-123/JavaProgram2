package ArrayPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		multiplyOfArray(ar);
	}

	public static void multiplyOfArray(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			int temp = 1;
			for (int j = 0; j < ar.length; j++) {
				if(i!=j) {
					temp = temp*ar[j];
				}
			}
			System.out.print(temp+" ");
		}

	}

}
