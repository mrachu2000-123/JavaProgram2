package arrayPrograms;

import java.util.Scanner;

public class FrequencyOfMatrix {

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

		int even =0, odd =0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(ar[i][j]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		
		System.out.println("Even no. frequency  "+even);
		System.out.println("Odd no. frequency  "+odd);

	}
}