import java.util.Scanner;

public class CubicArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		cubic(ar);
	}

	private static void cubic(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i]*ar[i]*ar[i];
			System.out.print(ar[i]+" ");
		}
	}
}
