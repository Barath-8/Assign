package test;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the value n : ");
		int n=sc.nextInt();
		
		sc.close();
		
		for(int i=0 ; i<=n ; i++) {
			int col_len = (i*2)+1,
					mid = col_len/2;
			
			int val=mid-1;
			
			for(int j=0 ; j<col_len ; j++) {
				if(j==0 || j==col_len-1)
					System.out.print("*");
				else {
					if(j<=mid)
						System.out.print(j);
					else
						System.out.print(val--);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i =n-1 ; i>=0 ; i--) {
			int col_len = (i*2)+1,
					mid = col_len/2;
			int val =mid-1;
			for(int j=0 ; j<col_len ; j++) {
				if(j==0 || j==col_len-1)
					System.out.print("*");
				else {
					if(j<=mid)
						System.out.print(j);
					else
						System.out.print(val--);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
