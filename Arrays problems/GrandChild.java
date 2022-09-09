
public class GrandChild {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][]={{"luke"  , "shaw"},
						{"wayne" , "rooney"},
						{"rooney", "ronaldo"},
						{"shaw"  , "rooney"},
						{"mary", "wayne"}};
		
		String target = "rooney";
		int grandchld =0;
		
		for(int i=0 ; i<str.length ; i++) 
				if(str[i][1].equals(target)) 
					grandchld += grandChild(str,str[i][0]);
				
		System.out.println("GrandChild for the target : "+grandchld);
	}

	 

	public static int grandChild(String str[][],String target) {
		
		int count =0;
		
		for(int i=0 ; i<str.length ; i++) 
				if(str[i][1].equals(target)) 
					count++;
					//count+=grandChild(str,str[i][0]);
				
		
		
		return count;	
	}


}
