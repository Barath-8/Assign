package test;
import java.util.*;
public class WordSearch {
	
	
	
	public static void main(String[] args){
		WordSearch obj = new WordSearch();
		obj.search();
	}


	
	private List<String> result;
	private Map<Character,String> map;
	
	private void search(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter number of Rows : ");
		int row = sc.nextInt();

		System.out.print("\nEnter number of column : ");
		int col = sc.nextInt();
		
		char arr[][]= new char[row][col];
		
		System.out.println("Enter values in 2Darray : ");
		for(int r=0 ; r<row ; r++)
			for(int c=0 ; c<col ;c++ )
				arr[r][c]=sc.next().charAt(0);
		
		System.out.print("\nEnter the number of words in Dictionary : ");
		int len =sc.nextInt();
		
		String wrds[] = new String[len];
		System.out.println("Enter dictionar words : ");
		
		for(int i=0 ; i<len ; i++)
			wrds[i]=sc.next();
		
//		char arr[][]= {{'a','z','o','l'},
//					 {'n','x','h','o'},
//					 {'v','y','i','v'},
//					 {'o','r','s','e'}};
//		
//		String wrds[] = {"van","zoho","love","are","is"};
		
		map = new HashMap<>();
		
		for(String str : wrds)
			map.put(str.charAt(0), str);
		
		result = new ArrayList<>();
		
		for(int r=0 ; r<arr.length ; r++)
			for(int c=0 ; c<arr[r].length ;c++ )
				if(map.containsKey(arr[r][c]))
					dfs(arr,r,c,map.get(arr[r][c]),0);
		
		System.out.println("The words found in 2D grid are : ");
		result.stream().forEach(str->System.out.println(str));
		
		sc.close();
	}
	
	private void dfs(char[][] arr,int r,int c,String wrd,int idx) {
		
		
		if(r<0 || c<0 || r==arr.length || c==arr[r].length || arr[r][c]!=wrd.charAt(idx) )
			return;
		
		if(idx==wrd.length()-1) {
			map.remove(wrd.charAt(0));
			result.add(wrd);
			return ;
		}
		
		dfs(arr,r,c+1,wrd,idx+1);
		dfs(arr,r+1,c,wrd,idx+1);
		
	}
	

}
