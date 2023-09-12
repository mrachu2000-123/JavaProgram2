import java.util.Arrays;
import java.util.Scanner;
public class Duplicate{  
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();	
		}
		removeDuplicates(ar);
	}

	public static void removeDuplicates(int[] ar) {
		
//		Arrays.sort(ar);
		int temp = 0;
		for (int i = 0; i < ar.length-1; i++) {
			
			if(ar[i]!=ar[i+1]) {
				
				if(temp != ar[i]) {
					System.out.print(ar[i]+" ");
				}
				temp = ar[i];
				
			}
       
		}	
		System.out.print(ar[ar.length-1]+" ");
		
	}
	
}