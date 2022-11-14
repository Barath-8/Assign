package test;
import java.util.*;
public class RelaceAlternate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the length of array : ");
		
		int len = sc.nextInt();
		
		int arr[]= new int[len];
		
		for(int i=0 ; i<len ; i++)
			arr[i]=sc.nextInt();
		sc.close();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i<len ; i++) 
			if(!set.add(arr[i])) {
				set.remove(arr[i]);
				arr[i]=0;
			}
		
		
		
		System.out.println("The arrays : "+Arrays.toString(arr));
	}

}
