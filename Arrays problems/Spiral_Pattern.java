
public class Spiral_Pattern {

	public static void main(String[] args) {
		int arr[][]={{4,3,2,1},
					{5,14,13,12},
					{6,15,16,11},
					{7,8,9,10} 
					};
		
		int rowStart =0 , rowEnd=arr.length-1,
			colStart =0 , colEnd=arr[0].length-1;
		
		
		while(rowStart <rowEnd && colStart <colEnd) {
			for(int i=colEnd ; i>=colStart ; i--) 
				System.out.print(arr[rowStart][i]+" ");
			rowStart++;
			
			for(int i=rowStart ; i<=rowEnd  ; i++)
				System.out.print(arr[i][colStart]+" ");
			colStart++;
			
			for(int i=colStart ; i<=colEnd; i++ )
				System.out.print(arr[rowEnd][i]+" ");
			rowEnd--;
			
			for(int i=rowEnd ; i>=rowStart ; i--)
				System.out.print(arr[i][colEnd]+" ");
			colEnd--;
				
			
		}
		

	}

}
