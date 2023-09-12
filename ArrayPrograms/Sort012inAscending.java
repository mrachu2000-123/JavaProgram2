package ArrayPrograms;

import java.util.Scanner;

public class Sort012inAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		sortAscending(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static void sortAscending(int[] ar) {

		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		
	}

}
