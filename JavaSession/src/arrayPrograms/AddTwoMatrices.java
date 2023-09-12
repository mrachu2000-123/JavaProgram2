package arrayPrograms;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count:");
		int m = sc.nextInt();
		System.out.println("Enter the column count:");
		int n = sc.nextInt();
		int[][] ar = new int[m][n];

		System.out.println("Enter the first matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		int[][] ar1 = new int[m][n];

		System.out.println("Enter the second matrix");
		for (int i = 0; i <m; i++) {
			for (int j = 0; j <n; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}

		System.out.println("The Resultant matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print((ar[i][j]+ar1[i][j])+" ");
			}
			System.out.println();
		}
	}

}
