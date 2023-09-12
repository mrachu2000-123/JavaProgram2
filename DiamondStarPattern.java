import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( i+j==n/2 || i-j==n/2 || 
				    j-i==n/2 || i+j==(n-1)+n/2  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
