package arrayPrograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		ReverseArray.reverse(ar);
	}

	public static void reverse(int[] ar) {
		
		for (int i = ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
