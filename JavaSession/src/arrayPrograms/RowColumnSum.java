package arrayPrograms;

import java.util.Scanner;

public class RowColumnSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count:");
		int m = sc.nextInt();
		System.out.println("Enter the Column count:");
		int n = sc.nextInt();
		int[][] ar = new int[m][n];

		System.out.println("Enter the Matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextInt();
			}
		}


		for (int i = 0; i < m; i++) {
			int rowsum =0;
			for (int j = 0; j < n; j++) {
				rowsum = rowsum+ar[i][j];
			}
			System.out.print(rowsum+" ");

		}
		System.out.println();

		for (int j = 0; j < n; j++) {
			int colsum = 0;
			for (int i = 0; i < m ; i++) {
				colsum = colsum+ar[i][j];
			}
			System.out.print(colsum+" ");

		}
	}

}
