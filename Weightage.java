import java.util.Arrays;
import java.util.Comparator;

public class Weightage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {49,36,8,10,12},
			len=arr.length,
			arr2[][]= new int[len][2];
		
		for(int i=0 ; i<arr.length ; i++) {
			int points =0;
			
				if(arr[i]%4 ==0 &&arr[i]%6 ==0)
					points +=4;
				if(arr[i]%2==0)
					points +=3;
				if(arr[i] == Math.pow((int)Math.sqrt(arr[i]), 2))
					points +=5;
			
			arr2[i][0]=arr[i];
			arr2[i][1]=points;
			
		}
		
		Arrays.sort(arr2,new Comparator<int[]>() {
			public int compare(int[] a,int[] b) {
				if(a[1] >b[1])
					return -1;
				else
					return 1;
			}
		});
		
	
		
		System.out.println(Arrays.deepToString(arr2));
	}

}
