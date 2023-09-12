import java.util.Scanner;

class TurnOver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0;i<t;i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			candies(a,b);
		}

	}

	private static void candies(int a, int b) {

		int n = (int) Math.sqrt(a);
		if((n*n)+n>b) {
			System.out.println("Bob");
		}
		else {
			System.out.println("Alex");
		}
	}

}
