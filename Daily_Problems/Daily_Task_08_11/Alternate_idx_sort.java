
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Alternate_idx_sort {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5,6,7,8};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i =0 ; i<arr.length ; i++ )
			map.put(arr[i], i);
		
		Arrays.sort(arr,(a,b)->{
			int idx1 = map.get(a),
				idx2 = map.get(b);
			
			if(idx1%2==0 && idx2%2==0) {
				return a-b;
			}
			if(idx1%2!=0 && idx2%2!=0)
				return b-a;
			
			return b-a;
		});
		
		System.out.println(Arrays.toString(arr));

	}

}
