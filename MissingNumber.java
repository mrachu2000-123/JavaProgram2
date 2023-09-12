import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
		int res = missingNum(ar,n);
		System.out.println(res);
		
	}

	 static int missingNum(int[] ar, int n) {
		int len = (n+1)*(n+1+1)/2;
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum+ar[i];
		}
		return len-sum;
	}

}
