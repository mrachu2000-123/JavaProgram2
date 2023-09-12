import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0, mul=1;
		while(n>0) {
			int n1 = n%10;
			sum = sum+n1;
			mul = mul*n1;
			n = n/10;
		}
		System.out.println("Sum of number"+" = "+sum);
		System.out.println("Product of number"+" = "+mul);
		if(sum==mul) {
			System.out.println("Spy Number");
		}	else {
			System.out.println("Not Spy Number");	
		}
	}
}

