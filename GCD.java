import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		greatestCF(n,m);
	}

	public static void greatestCF(int n,int m) {
		
		for(int i = n;i>0;i--) {
			if(n%i==0 && m%i==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
