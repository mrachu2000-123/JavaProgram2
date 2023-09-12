import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		int[] ar1 = new int[n/2];
		int[] ar2 = new int[n/2];

		for(int i=0;i<ar.length;i++) {
			ar[i]= scan.nextInt();
		}

//		for(int i=0;i<ar.length/2;i++) {
//			ar1[i] = ar[i];
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();
//
//		for(int i=ar.length/2-1;i<ar.length;i++) {
//			for(int j=0;j<ar.length/2;j++) {
//				ar2[j]=ar[1];
//				i++;
//				System.out.print(ar[i]+" ");
//			}
//		}
		
		for(int i=0;i<ar.length/2;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=ar.length/2;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}

