import java.util.Arrays;

public class Matrix_Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2},{3,4}},
			arr2[][]= {{5,6,7},{8,9,10}};
		
		if(arr1[0].length ==arr2.length) {
		
			int res[][] =new int[arr1.length][arr2[0].length];
		
		
			int len = res.length,
			innerLen=res[0].length;
		
		
			for(int i=0 ; i<len  ; i++) 
				for(int j=0 ; j<innerLen ; j++) 
					for(int k =0 ; k<len ; k++)
					res[i][j]+=(arr1[i][k]*arr2[k][j]);
			
		
		

		for(int i=0 ; i<len  ; i++) {
			for(int j=0 ; j<innerLen ; j++) 
				System.out.print(res[i][j]+" ");
			
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(res));
		
		}
		else
			System.out.println("Wrong Matrix");
	}

}
