import java.util.Map;
import java.util.HashMap;
//import java.util.Scanner;
public class Ques4 {
	
	//Equal arrays or not

	public static void main(String[] args) {
		
		int nums1[]= {1,2,5,4,0},
			nums2[]= {2,4,5,0,1};
		
		System.out.println("The two arrays are "+getRes(nums1,nums2));

	}

	private static String getRes(int[] nums1, int[] nums2) {
		
		Map<Integer,Integer> map1 =new HashMap<>(),
							 map2 = new HashMap<>();
		
		for(int val : nums1)
			map1.put(val, map1.getOrDefault(val, 0)+1);
		

		for(int val : nums2)
			map2.put(val, map2.getOrDefault(val, 0)+1);
		
		if(map1.equals(map2))
			return "Equal";
		
		return "Not equal";
	}

}
