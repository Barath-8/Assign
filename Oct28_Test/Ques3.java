
public class Ques3 {
	
	//Length of sub array with sum=0

	public static void main(String[] args) {
		
		int nums[]= {15,-2,2,-8,1,7,10,23};
		
		System.out.println("The Max length of Subarray with sum=0 is "+getRes(nums));

	}

	private static int getRes(int[] nums) {
		
		int max = 0 ;
		
		for(int i=0 ; i< nums.length ; i++) {
			int sum = nums[i];
			
			for(int j = i+1 ; j<nums.length ;j++) {
				sum+=nums[j];
				
				if(sum==0)
					max = Math.max(max, j-i+1);
			}
		}
		
		return max;
	}

}
