import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		int num = n;
		int a = n, b = n,sum = 0;
		
		while(num>0) {
			num = num/10;
			count++;
		}
		
		while(b>0) {
			a = b%10;
			sum = (int) (sum+Math.pow(a,count));
			b = b/10;
		}
		
		if(sum==n) {
			System.out.println(n+" is a Armstrong Number");
		}else {
			System.out.println(n+" is not an Armstrong Number");
		}
	 }
}	    	

