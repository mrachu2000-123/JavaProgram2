import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(isAutomorphic(n) ? "Automorphic" : "Not Automorphic");   

	}

	public static boolean isAutomorphic(int n) {
		int sq = n*n;

		while(n>0) {
			if((n%10) != (sq%10)) {
				return false;
			}else {
				n = n/10;
				sq = sq/10;
			}
		}
		return true;
	}
}
