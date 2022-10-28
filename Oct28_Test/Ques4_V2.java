import java.util.Map;
import java.util.HashMap;
//import java.util.Scanner;
public class Ques4_V2 {
	
	//Equal arrays or not
	// Using single map obj

	public static void main(String[] args) {
		
		int nums1[]= {1,2,0,3,4},
			nums2[]= {1,4,3,2,0};
		
		System.out.println("The two arrays are "+getRes(nums1,nums2));

	}

	private static String getRes(int[] nums1, int[] nums2) {
		
		if(nums1.length!=nums2.length) return "Not equal";
		
		Map<Integer,Integer> map =new HashMap<>();
		
		for(int val : nums1)
			map.put(val, map.getOrDefault(val, 0)+1);
		

		for(int val : nums2)
			if(!map.containsKey(val))
				return "Not equal";
			else {
				int count = map.get(val)-1;
				
				if(count==0)
					map.remove(val);
				else
					map.put(val, count);
			}
			
		if(map.isEmpty())
			return "Equal";
		
		return "Not equal";
	}

}
