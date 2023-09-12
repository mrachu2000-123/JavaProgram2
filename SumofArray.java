import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
		System.out.println(sumArray(ar));
		
	}

	private static int sumArray(int[] ar) {
		
		int sum =0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		return sum;
		
	}

}
