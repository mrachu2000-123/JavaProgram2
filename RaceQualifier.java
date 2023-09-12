import java.util.Scanner;

public class RaceQualifier {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		
		int result = qualifier(ar,k);
		System.out.println(result);
	}

	private static int qualifier(int[] ar, int k) {
		int count = 0;
		for(int i=0;i<ar.length;i++) {
		if(ar[i]<=(ar[k-1])) {
			count++;
		}
		
		}
		return count;
	}

}
