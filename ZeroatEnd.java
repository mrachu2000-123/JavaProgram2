import java.util.Scanner;

public class ZeroatEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}

		zeroEnd(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	static void zeroEnd(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[i]==0 && ar[j]!=0) {
					ar[i]=ar[j];
					ar[j]=0;
				}
			}
		}
	}
}
