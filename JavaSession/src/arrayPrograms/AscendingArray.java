package arrayPrograms;

import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		AscendingArray.ascend(ar);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static int[] ascend(int[] ar) {

		int c = 0;    

		for (int i = 0; i < ar.length; i++) { 
			for (int j = i+1; j < ar.length; j++) {    
				if(ar[i] > ar[j]) 	{   
					c = ar[i];    
					ar[i] = ar[j];    
					ar[j] = c;    
				}     
			}     
		}
		return ar;    

	}
}