
public class FamilyTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][]={{"luke"  , "shaw"},
						{"wayne" , "rooney"},
						{"rooney", "ronaldo"},
						{"shaw"  , "rooney"},
						{"mary", "wayne"}};
		
		String target = "ronaldo";
		
		int Total_Mem = Family_Members(str,target);
		
		System.out.println("Total Family members excluding target : "+Total_Mem);
	}
	
	
	public static int Family_Members(String str[][],String target) {
		
		int count =0;
		for(int i=0 ; i<str.length ; i++) {
				
			if(str[i][1].equals(target)) {
					count++;
					count+=Family_Members(str,str[i][0]);
				
			}
		}
		
		return count;	
	}

}
