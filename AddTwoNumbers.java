import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int res = add(a,b);
		System.out.println(res);
	}

	public static int add(int a, int b) {
		
		int c = a+b;
		return c;
	}

}



