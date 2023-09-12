package arrayPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		CopyArray.allElements(ar);
	}

	public static void allElements(int[] ar) {
		
		int[] ar1 = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			ar1[i] = ar[i];
			System.out.print(ar1[i]+" ");
		}
	}

}
