package arrayPrograms;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] ar = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

 			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {

					System.out.print(ar[j][i]+" ");
				}
				System.out.println();
			}
	}

}
