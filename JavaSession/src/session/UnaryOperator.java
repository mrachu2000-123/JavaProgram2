package session;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// Unary Plus
		System.out.println("Unary plus of a :"+ a); 
		// Unary Minus
		System.out.println("Unary minus of a :"+ -a);   	
		System.out.println();

		//	Increment Operator

		//Pre-increment operator
		System.out.println("Value of a :"+ a);
		System.out.println(++a);   
		System.out.println("After pre-increment the value of a : "+ a);
		System.out.println();

		//Post-increment operator
		System.out.println("Value of a :"+ a);
		System.out.println(a++);     
		System.out.println("After post-increment the value of a : "+ a);
		System.out.println();

		//  Decrement Operator

		//Pre-decrement operator
		System.out.println("Value of a :"+ a);
		System.out.println(--a);   
		System.out.println("After pre-decrement the value of a : "+ a);
		System.out.println();

		//Post-decrement operator
		System.out.println("Value of a :"+ a);
		System.out.println(a--);     
		System.out.println("After post-decrement the value of a : "+ a);
		System.out.println();

		//  Logical Complement Operator
		Boolean x = true;
		System.out.println("Complement of x : "+ !x);
	}

}
