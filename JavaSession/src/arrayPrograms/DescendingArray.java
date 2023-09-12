package arrayPrograms;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		DescendingArray.descend(ar);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
			
		}
		
		for (int i = ar.length-1; i >=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

	public static int[] descend(int[] ar) {

		int c = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if(ar[i]<ar[j]) {
					c = ar[j];
					ar[j] = ar[i];
					ar[i] = c;
				}
			}
		}
		return ar;
		
//		return AscendingArray.ascend(ar);
	}

}
