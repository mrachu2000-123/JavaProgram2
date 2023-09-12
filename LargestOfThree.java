import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int res = largestOfThree(a,b,c);
		System.out.println(res);
	}

	private static int largestOfThree(int a, int b, int c) {
		
		if( a>b && a>c) {
			return a;
		}
		else if(b>c){
			return b;
		}
		else {
		return c;
		}
	}
}
