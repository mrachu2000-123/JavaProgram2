package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CodechefDolls {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i =0;i<t;i++){
			int n = sc.nextInt();
			int[] ar = new int[n];

			for(int j = 0;j<ar.length;j++){

				ar[j] = sc.nextInt();
			}

			dollsCount(ar);

		}
	}

	static void dollsCount(int[] ar){
		
		Arrays.sort(ar);
		
		int count = 1;
		
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				if(count<2)
				System.out.println(ar[i]+"----"+count);
				count = 1;
			}
		}
		if(count<2)
			System.out.println(ar[ar.length-1]+"----"+count);
		
	}

}
