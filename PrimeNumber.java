import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(primeOrNot(n));
	}

	public static String primeOrNot(int n) {

		for(int i = 2;i<=n/2;i++) {
			if(n%i ==0) {
				return"Not Prime";
			}
			}
		return "Prime";
	}

}
