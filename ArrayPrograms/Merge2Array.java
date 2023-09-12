package ArrayPrograms;

import java.util.Scanner;

public class Merge2Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar1 = new int[n];
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] ar2 = new int[m];
		
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = sc.nextInt();
		}
		
		int[] resl = mergeArray(ar1,ar2);
		
		for (int i = 0; i < resl.length; i++) {
			System.out.print(resl[i]+" ");
		}
		
	

	}

	public static int[] mergeArray(int[] ar1, int[] ar2) {

		int[] res = new int[ar1.length+ar2.length];
		
		int i = 0, k = 0, j = 0;
		while(i<ar1.length && j<ar2.length ) {
			if(ar2[j]<ar1[i]) {
				res[k] = ar2[j];
				k++;
				j++;
			}else {
				res[k] = ar1[i];
				k++;
				i++;
			}
		}
		
		while(i<ar1.length) {
			res[k] =  ar1[i];
			k++;
			i++;
		}
		
		while(j<ar2.length) {
			res[k] =  ar2[j];
			k++;
			j++;
		}
		return res;		
		
	}

}
