import java.util.HashMap;
import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter array length : ");
		int n = sc.nextInt();
		
		int nums[]= new int[n];
		System.out.print("\nEnter array elements :");
		
		for(int i=0 ; i<n ; i++)
			nums[i]=sc.nextInt();
		
		System.out.print("\nEnter k : ");
		int k = sc.nextInt();
		
//		int nums[]= {1,7,4,3,4,8,7};
//		int k = 2;
		
		int ans =getRes(nums,k);
		
		if(ans==-1) 
			System.out.println("No such element with "+k+" frequencies exists");
		else
		System.out.println("The number is : "+ans);
		
		sc.close();
	}

	private static int getRes(int[] nums, int k) {
		
		HashMap<Integer,Integer> freq = new HashMap<>();
		
		for(int val : nums) {
			freq.put(val, freq.getOrDefault(val, 0)+1);
			
			if(freq.get(val)==k)
				return val;
		}
			
		
		return -1;
	}

}
