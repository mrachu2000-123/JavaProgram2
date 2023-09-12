import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar= new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
		subArray(ar);
	}

	private static void subArray(int[] ar) {

		for (int i = 0; i <ar.length; i++) {
			for(int j =i;j<ar.length;j++ ) {
				for(int k=i;k<j;k++) {
					
					System.out.print(ar[k]+" ");
				}
				System.out.println();
			}
			
		}
	}

}
