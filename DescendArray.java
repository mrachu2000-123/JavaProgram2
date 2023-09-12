import java.util.Scanner;

public class DescendArray {

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar =new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		
		descend(ar);
	
	}

	private static void descend(int[] ar) {

		int t =0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					t =ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
