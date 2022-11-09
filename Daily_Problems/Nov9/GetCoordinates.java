import java.util.ArrayList;
import java.util.List;

public class GetCoordinates {

	public static void main(String[] args) {
		
		GetCoordinates obj =new GetCoordinates();
		
		obj.getAns();

	}
	List<String>ans;
	private void getAns() {
		
		char arr[][]=  { {'B', 'N', 'E', 'Y', 'S'}, 
						{'H', 'E', 'D', 'E', 'S'},
						{'S', 'G', 'N', 'D', 'E'} }; 
		
//		String word = "DES";
		
		String word = "BNEGSHBN";
		ans = new ArrayList<>();
		
		for(int r=0 ; r<arr.length ; r++ )
			for(int c=0 ; c<arr[r].length ; c++)
				if(arr[r][c]==word.charAt(0))
					dfs(arr,r,c,word,0,"");
		
		ans.stream().forEach(s->System.out.println(s));
	}

	private void dfs(char[][] arr, int r, int c, String word, int i,String temp) {
		
		if(r==arr.length)
			r=0;
		if(r==-1)
			r=arr.length-1;
		
		if(c==arr[r].length)
			c=0;
		
		if(c==-1)
			c=arr[r].length-1;
		
		if(arr[r][c]=='#'|| arr[r][c]!=word.charAt(i))
			return ;
		
		
		String cmb = temp+word.charAt(i)+"("+r+","+c+") ";
		
		if(i==word.length()-1) {
			ans.add(cmb);
			return;
		}
//		arr[r][c]='#';
		
		dfs(arr,r+1,c,word,i+1,cmb);
		dfs(arr,r-1,c,word,i+1,cmb);
		dfs(arr,r,c+1,word,i+1,cmb);
		dfs(arr,r,c-1,word,i+1,cmb);
		
		dfs(arr,r+1,c+1,word,i+1,cmb);
		dfs(arr,r-1,c-1,word,i+1,cmb);
		dfs(arr,r+1,c-1,word,i+1,cmb);
		dfs(arr,r-1,c+1,word,i+1,cmb);
		
//		arr[r][c]=word.charAt(i);
		
	}

}
