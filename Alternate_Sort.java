import java.util.*;



public class Alternate_Sort {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int len = arr.length,
			mid;
		
		Arrays.sort(arr);
		
		if(len%2 !=0)
			mid =len/2;
		else
			mid= len/2-1;
			
		int i=mid;
		int j=mid+1;
		
		while(i>=0 && j<len) {
			System.out.print(arr[i--] + "," +arr[j++]);
			
			if(j<len)
				System.out.print(",");
		}
		
		if(i==0)
			System.out.print(","+arr[i]);
		
//		for(int i=0 ; i<= mid ; i++) {
//
//			try {	
//			System.out.print( arr[mid-i] + "," + arr[mid+i+1] );
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.print(arr[0]);
//			}
//			
//			if(i!=mid)
//					System.out.print(",");
//			}
//			

		}
		
	

}
