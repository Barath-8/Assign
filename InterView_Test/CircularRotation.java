package test;
import java.util.*;

public class CircularRotation {

	public static void main(String[] args) {
		CircularRotation obj =new CircularRotation();
		
//		char arr[][] = {{1,2,3,4},
//					   {4,1,2,3},
//					   {3,4,1,2},
//					   {2,3,4,1}};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the length of square matrix : ");
		int len = sc.nextInt();
		
		char arr[][]=new char[len][len];
		
		System.out.println("Enter the values : ");
		
		for(int r = 0 ;r<len ; r++) 
			for(int c = 0 ; c<len ; c++)
				arr[r][c]=sc.next().charAt(0);
		
		boolean result = obj.check(arr);
			
		System.out.println("Is the given matrix row elements are circular rotated : "+result);
		
		sc.close();

	}

	private boolean check(char[][] arr) {
		int len = arr.length;
		
		for(int i=0; i<len; i++) {   //to check row =0  all col dia are equal
			char  val =arr[i][0];
			
			if(i>0 && val != arr[i-1][len-1]) // to  check start element is prev last element
				return false;
			
			for(int r=i,c=0 ; r<len&&c<len ; r++,c++)
				if(arr[r][c]!=val)
					return false;
		
		}
		
		for(int i=0; i<len; i++) {
			
			char val =arr[0][i]; //to check col=0 all row dia are qual;
			
			for(int r=0,c=i ; r<len&&c<len ; r++,c++)
				if(arr[r][c]!=val)
					return false;
		}
		
		return true;
	}

}
