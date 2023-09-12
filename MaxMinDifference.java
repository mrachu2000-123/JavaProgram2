import java.util.Scanner;

public class MaxMinDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i]= scan.nextInt();
		}

		System.out.println(ar[ar.length-1]);
		System.out.println(ar[ar.length-2]);
		int max = ar[ar.length-1]-ar[ar.length-2];
		System.out.println(ar[ar.length-1]+"-"+ar[ar.length-2]+"="+max);
		
		System.out.println(ar[1]);
		System.out.println(ar[0]);
		int min = ar[1]-ar[0];
		System.out.println(ar[1]+"-"+ar[0]+"="+min);

	}

}
