import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		SpiralMatrix obj = new SpiralMatrix();
		
		obj.printSprial();
		

	}

	private void printSprial() {
		
		int n = 5;
		
		int arr[][]=new int[n][n];
		
		fill(arr);
		
		Arrays.stream(arr).forEach(e->System.out.println(Arrays.toString(e)));
		
	}

	private void fill(int[][] arr) {
		int len=arr.length,
			val=1;
		
		int rowStart=0,colStart=0,
			rowEnd=len-1,colEnd=len-1;
		
		while(rowStart<colEnd) {
			for(int i = colStart ;i<=colEnd ;i++)
				arr[rowStart][i]=val++;
			rowStart++;
			
			for(int i = rowStart ;i<=rowEnd ;i++)
				arr[i][colEnd]=val++;
			colEnd--;
			
			for(int i = colEnd ; i>=colStart ;i--)
				arr[rowEnd][i]=val++;
			rowEnd--;
			
			for(int i = rowEnd ;i>=rowStart ;i--)
				arr[i][colStart]=val++;
			colStart++;
			
		}
		
		if(len%2!=0)
			arr[rowStart][colEnd]=val;
		
		
	}

}
