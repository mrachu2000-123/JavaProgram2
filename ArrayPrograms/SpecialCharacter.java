package ArrayPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class SpecialCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
	    for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
	    
	    insertSC(ar);
	}

	public static void insertSC(int[] ar) {
		
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]%2 == 1 && ar[i+1]%2 == 1) {
				System.out.print(ar[i]+"*");
			}else if(ar[i]%2 == 0 && ar[i+1]%2 == 0) {
				System.out.print(ar[i]+"#");
			}else {
				System.out.print(ar[i]+"$");
			}
		}
		
		System.out.print(ar[ar.length-1]);
	}

}
