package ArrayPrograms;

import java.util.Scanner;

public class SwapReturnLargest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int[] ar1 = new int[n];

		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = ar[i];
		}

        SwapLargest(ar,ar1);
	}

	public static void SwapLargest(int[] ar, int[] ar1) {
		
		int i =0;
		int temp = 0;
		while(i<ar.length/2) {
			for (int j = 0; j < ar1.length-2; j++){
				if(ar[j]<ar[j+2]) {
					temp = ar[j];
					ar[j] = ar[j+2];
					ar[j+2] = temp;
				}
			}
			i++;
		}
		for (int j = 0; j < ar1.length; j++) {
			System.out.print(ar[j]+" ");
		}
	}

}
