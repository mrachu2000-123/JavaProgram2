package ArrayPrograms;

import java.util.Scanner;

public class SlindingWindowMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		maxOfNum(ar,k);

	}

	public static void maxOfNum(int[] ar, int k) {

		int temp = 0;
		for (int i = 0; i <= ar.length-k; i++) {
			for (int j = i; j <(i+k)-1 ; j++) {
					if(ar[j]<ar[j+1] && temp<ar[j+1]) {
						temp = ar[j+1];
					}else {
						if(temp<ar[j])
						temp = ar[j];
					}
			}
			System.out.println(temp);
		}
	}

}
