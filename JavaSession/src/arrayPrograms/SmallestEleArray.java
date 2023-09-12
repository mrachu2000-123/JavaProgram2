package arrayPrograms;

import java.util.Scanner;

public class SmallestEleArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("Smallest number in an array : "
				+ SmallestEleArray.smallestElement(ar));
		
	}

	public static int smallestElement(int[] ar) {

		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i < ar.length; i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		
		return min;
	}

}
