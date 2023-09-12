package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ExtSomeProperties {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		repeatedXTimes(ar);
		
	}

	public static void repeatedXTimes(int[] ar) {

		int x = ar.length/2;
		int count = 1;
		Arrays.sort(ar);
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1]) {
				count++;
			}else {
				if(count==x) {
					System.out.println(ar[i]+" "+count);
				}
				count = 1;
			}
		}
		if(count==x) {
			System.out.println(ar[ar.length-1]+" "+count);
		}
	}

}
