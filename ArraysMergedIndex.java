import java.util.Scanner;

public class ArraysMergedIndex {

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

		int k = sc.nextInt();
		int[] ar3 = new int[k];
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = sc.nextInt();
		}

		int[] res = ArraysMergedIndex.mergeSameIndex(ar1,ar2,ar3);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static int[] mergeSameIndex(int[] ar1, int[] ar2, int[] ar3) {

		int[] res = new int[ar1.length+ar2.length+ar3.length];

		int x =0,i=0;

		while(i<res.length) {

			if(x<ar1.length) {
				res[i] = ar1[x];
				i++;
			}
			if(x<ar2.length) {
				res[i] = ar2[x];
				i++;
			}
			if(x<ar3.length) {
				res[i] = ar3[x];
				i++;
			}
			x++;
		}
			return res;
		}

	}
