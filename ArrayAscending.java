import java.util.Scanner;
public class ArrayAscending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		 ascending(ar);
	}

	public static void ascending(int[] ar) {
		
		int c = 0;    
        
        for (int i = 0; i < ar.length; i++)  
        {     
           for (int j = i+1; j < ar.length; j++)    
           {     
              if(ar[i] > ar[j]) 
              {    
                  c = ar[i];    
                  ar[i] = ar[j];    
                  ar[j] = c;    
              }     
           }     
       }    
        
       for (int i = 0; i < ar.length; i++) 
       {     
           System.out.print(ar[i] + " ");    
       }    
	}
}
