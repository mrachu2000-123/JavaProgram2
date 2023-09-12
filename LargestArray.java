import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		Secondlargest(ar);
	}

	private static void Secondlargest(int[] ar) {

		int l=Integer.MIN_VALUE;
		for (int i = 0; i < ar.length-1; i++) {

			if(ar[i]>ar[i+1] && l<ar[i]) {
				l =ar[i];
			}
		}
		if(l<ar[ar.length-1]) {
			l=ar[ar.length-1];
		}
		System.out.println(l);
	}

}
