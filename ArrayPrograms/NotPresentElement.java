package ArrayPrograms;

import java.util.Scanner;

public class NotPresentElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		int[] ar1 = new int[n];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = sc.nextInt();
		}
		
		int[] ar2 = new int[n];
		int[] ar3 = new int[n];
		
		notEqualElement(ar,ar1, ar2, ar3);
		
	}

	public static void notEqualElement(int[] ar, int[] ar1, int[] ar2, int[] ar3) {

		int i = 0 , j = 0, k= 0 , l = 0;
		
		while(i<ar.length && j<ar1.length) {
			if(ar[i]<ar1[j]) {
				ar2[k++] = ar[i];
				i++;
			}else if(ar[i]>ar1[j]) {
				ar3[l++] = ar[j];
				j++;
			}else if(ar[i] == ar1[j]){
				i++;j++;
			}
		}
		
		while(i<ar.length) {
			ar2[k++] = ar[i];
			i++;
		}
		
		while(j<ar1.length) {
			ar3[l++] = ar1[j];
			j++;
		}
		
		for (int l2 = 0; l2 < ar2.length; l2++) {
			System.out.print(ar2[l2]+" ");
		}
		
		System.out.println();
		
		for (int l2 = 0; l2 < ar3.length; l2++) {
			System.out.print(ar3[l2]+" ");

		}
	}

}