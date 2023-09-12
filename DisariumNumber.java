import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n,n2 = n, count = 0, sum =0;
		while(n1>0) {
			 n1 = n1/10;
			 count++;
		}
		
		while(n2>0) {
			int a = n2%10;
		   sum+= Math.pow(a, count--);
		   n2 = n2/10;
		}
		
		if(sum == n) {
			System.out.println(n+" Disarium Number");
		}else {
			System.out.println(n+" Not Disarium Number");
		}
	}

}
