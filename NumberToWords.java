import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n<0) {
			System.out.println("Negative input not allowed");
		}else {
			System.out.print(n+" ");
		}

		int u = n%10;
		int tt = n/10;
		int t = tt%10;
		int h = n/100;
		int ht = h% 10;
		int th = n/1000;

		String uw[] ={"","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
				"sixteen","seventeen","eighteen","nineteen"};
		String tw[] ={"","ten","twenty","thirty","forty","fifty","sixty","seventy",
				"eighty","ninety"};
		String hw ="hundred";
		String thw = "thousand";

		if(n<20) {
			System.out.println(uw[n]);
		}else if(n<100) {
			System.out.println(tw[t]+" "+uw[u]);
		}else if(n<1000) {
			System.out.println(uw[h]+" "+hw+" "+tw[t]+" "+uw[u]);
		}
		else {
			if(ht == 0 && t == 0 && u ==0) {
				System.out.println(uw[th]+" "+thw+" ");
			}else if(ht == 0) {
				System.out.println(uw[th]+" "+thw+" "+tw[t]+" "+uw[u]);
			}
			else {
				System.out.println(uw[th]+" "+thw+" "+uw[ht]+" "+hw+" "+tw[t]+" "+uw[u]);
			}
		}
	}
}