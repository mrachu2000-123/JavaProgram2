import java.util.Scanner;
import java.util.Arrays;  

public class DulpicateUnsortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();	
		}
		
		Arrays.sort(ar);
		
		Duplicate.removeDuplicates(ar);
	}

}
