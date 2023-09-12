package arrayPrograms;

import java.util.Scanner;

public class IdentityMatrix {

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

		int flag = 0;
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++){
				if((i == j && ar[i][j] != 1) || (i != j && ar[i][j] != 0)) {
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println("The matrix entered is not an Identity Matrix.");
		}
		else {
			System.out.println("The matrix entered is an Identity Matrix.");
		}
	}
}
