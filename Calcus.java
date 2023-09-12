import java.util.Scanner;

class Arithmetic {

	void add(int x, int y) {
		System.out.println("Sum of number :"+ (x+y));		
	}
	
	void sub(int x, int y) {
		System.out.println("Difference of number :"+ (x-y));
	}
}	
 
  class Calculation extends Arithmetic{
	  
	  void mul(int x, int y) {
			System.out.println("Multiplication of number :"+ (x*y));
		}
  }

  class Calcus{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int x = scan.nextInt();
		System.out.println("Enter the second number :");
		int y = scan.nextInt();
		
		Calculation c = new Calculation();
		c.add(x,y);
		c.sub(x,y);
		c.mul(x,y);
 
	}
 }

