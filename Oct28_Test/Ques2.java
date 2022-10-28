import java.util.*;

public class Ques2 {
	
	//Array Leaders
	
	public static void main(String[] args) {
		
		int nums[]={16,17,4,3,5,2};
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("\nEnter array length : ");
//		int n = sc.nextInt();
//		
//		int nums[]= new int[n];
//		System.out.println("Enter array elements :");
//		
//		for(int i=0 ; i<n ; i++)
//			nums[i]=sc.nextInt();
		
		
		System.out.print("\nThe array leader's are : ");
		
		getLeader(nums).stream().forEach(E->System.out.print(E+" "));
		
		//sc.close();
	}

	private static List<Integer> getLeader(int[] nums) {
		
		int max = nums[nums.length-1];
		
		List<Integer> ans = new ArrayList<>();
		
		ans.add(max);
		
		for(int i=nums.length-2 ; i>=0 ; i--)
			if(max<nums[i]) {
				max = nums[i];
				ans.add(max);
			}
		
		Collections.sort(ans,Collections.reverseOrder());
		
		return ans;
	}
	

}
