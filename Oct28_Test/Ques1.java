import java.util.HashMap;
import java.util.Map;

public class Ques1 {
	
	
	//List the possible anagram 
	public static void main(String[] args) {
		
		
		
		String str = "abbba";
		
		System.out.println("The possible anagrams are : "+getRes(str));

	}

	private static int getRes(String str) {
		
		int count = 0;
		
		for(int i=0 ; i<str.length() ;i++) {
			for(int j=i+1 ; j<=str.length() ; j++)
				count +=getC(str.substring(i, j),str.substring(i+1));
		}
		
		return count;
	}

	private static int getC(String ck, String str) {
		
		int len1 = ck.length(),len2 = str.length();
		
		if(len1>len2) return 0;
		
		Map<Character,Integer> map1 =new HashMap<>(),
				 			   map2 = new HashMap<>();

		for(char  val : ck.toCharArray())
			map1.put(val, map1.getOrDefault(val, 0)+1);
		
		int i=0 , j = len1-1;
		
		int count =0;
		
		for(int k =0 ; k<j ; k++) {
			char curr = str.charAt(k);
			map2.put(curr, map2.getOrDefault(curr, 0)+1);
		}
			
		
		while(j<len2) {
			
			char curr = str.charAt(j);
			map2.put(curr, map2.getOrDefault(curr, 0)+1);
			
			if(map1.equals(map2))
				count++;
			
			
			char prev = str.charAt(i);
			int val = map2.get(prev);
			
			if(val==1)
				map2.remove(prev);
			else {
				val-=1;
				map2.put(prev, val);
			}
			
			i++;
			j++;
			
		}
		
		return count;
	}
	
	

//	private static int getRes(String str) {
//		
//		Map<Character,Integer> map = new HashMap<>();
//		
//		boolean repeat = false;
//		
//		
//		int min = str.length()+1,
//			max = 0;
//		
//		for(char c : str.toCharArray()) {
//			if(map.containsKey(c)) {
//				repeat = true;
//				int val = map.get(c)+1;
//				map.put(c, val);
//				
//				min = Math.min(val, min);
//				max = Math.max(val, max);
//						
//			}
//			else
//				map.put(c, 1);
//		}
//		
//		if(!repeat)
//			return 0;
//			
//		if(palin(str)) 
//			return (int)Math.pow(min,max);
//		
//		
//		return 1;
//	}
//
//	private static boolean palin(String str) {
//		
//		int l = 0 , r = str.length()-1;
//		
//		while(l<r)
//			if(str.charAt(l++)!=str.charAt(r--))
//				return false; 
//		
//		return true;
//	}

}
