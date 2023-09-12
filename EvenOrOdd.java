import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      
		int a = scan.nextInt();
		evenOROdd(a);
	}

	public static void evenOROdd(int a) {
		
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
	}

}
