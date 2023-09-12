import java.util.Scanner;

public class InsertElementOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n+1];
		
		for (int i = 0; i < ar.length-1 ; i++) {
			ar[i] = scan.nextInt();	
		}
		
		ar[ar.length-1]= scan.nextInt();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
