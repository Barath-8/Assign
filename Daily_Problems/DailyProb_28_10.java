
import java.util.*;

public class DailyProb_28_10 {

	public static void main(String[] args) {
			//viral_ad(5);
			//weighted_unifrom();
			//decode_String();
			immutable();
	}

	private static void immutable() {
		String str = "abcde";
		
		String str2= "abcde";
		
		System.out.println("String 1 : "+str + "\nString 2 : "+str2);
		System.out.println("before altering : "+isSame(str,str2));
		
		str+="fgh";

		System.out.println("String 1 : "+str + "\nString 2 : "+str2);
		System.out.println("after altering : "+isSame(str,str2));
		
	}

	private static String isSame(String str, String str2) {
		
		if(str==str2)
			return "Both are having shared memeory";
		
		return "Both have unique address ";
	}

	private static void decode_String() {
		
		String str = "IDIDII";
		
		System.out.println(str +"--> "+decode(str));
		
	}

	private static String decode(String str) {
		
		StringBuilder s = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0 ; i<=str.length() ; i++) {
			st.push(i+1);
			
			if(i==str.length() || str.charAt(i)=='I')
				while(!st.isEmpty())
					s.append(st.pop());
		}
			
		
		return s.toString();
	}

	@SuppressWarnings("unused")
	private static void viral_ad(int n) {
		System.out.println("Total likes in "+n+" days is "+getLikes(5,n));
		
	}

	private static int getLikes(int views, int day) {
		int likes=views/2;
		if(day==1)
			return likes;
		return likes+getLikes(likes*3,day-1);
	}
	

	@SuppressWarnings("unused")
	private static void weighted_unifrom() {
		
		String str = "abccddde";
		List<Integer> queries = List.of(1,3,12,5,9,10);
		
		System.out.println(weightedUniformStrings(str,queries));
		
	}

	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
	        
	        Set<Integer> set = new HashSet<>();
	        
	        for(int i=0 ; i<s.length() ; i++){
	            char curr = s.charAt(i);
	            int pair = curr-'a'+1;
	            set.add(pair);
	            
	            int dup = pair;
	            while(i+1<s.length() && curr==s.charAt(i+1)){
	                dup+=pair;
	                set.add(dup);
	                i++;
	            }
	        }
	        
	        List<String> result = new ArrayList<>();
	        
	        queries.stream().forEach(E->{
	            if(set.contains(E))
	                result.add("Yes");
	             else
	                result.add("No");   
	        });
	        
	        return result;
	        

	    }

}
