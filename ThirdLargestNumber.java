import java.util.Scanner;

public class ThirdLargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		ThirdLargestNumber.thirdLargest(ar);
	}


	public static void thirdLargest(int[] ar) {

		int fl =Integer.MIN_VALUE, sl = Integer.MIN_VALUE, tl = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
				if(ar[i]>fl) {
					tl = sl;
					sl = fl;
					fl = ar[i];
					}
			     else if(ar[i]>sl){
					tl = sl;
					sl = ar[i];
				}else if(ar[i]>tl) {
					tl = ar[i];
				}
		}
		System.out.println(tl);
	}
}

