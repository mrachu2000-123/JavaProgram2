import java.util.Scanner;

public class ZeroIndexedInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		ZeroIndexedInteger.pairsWithIndex(ar,k);
	}

	public static void pairsWithIndex(int[] ar, int k) {

		int count =0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j] && (i*j)%k==0) {
					count++;
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
		System.out.println(count);
	}

}
