package session;

import java.util.Scanner;

public class UserDefinedFunction {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = scan.nextInt();

		
		UserDefinedFunction.evenOrOdd(a);
//		System.out.println(evenOrOdd(a));
	}

	public static void evenOrOdd(int a) {

		if(a%2==0) {
			System.out.println(a+" --> "+"is EVEN");
//			return(a+" --> "+"is EVEN");
		}else {
			System.out.println(a+" --> "+"is ODD");
//			return(a+" --> "+"is ODD");
		}
	}

}
