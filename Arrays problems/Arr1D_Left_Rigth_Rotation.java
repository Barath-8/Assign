import java.util.Arrays;

public class Arr1D_Left_Rigth_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
		int n=6;
		
		Arr_Left_Rotate(arr,n);
		Arr_Right_Rotate(arr,n);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Arr_Left_Rotate(int[] arr,int num) {
		int len = arr.length;
		for(int i=0 ; i<num%len ; i++) {
			int temp = arr[0];
			for(int j=0 ; j<len-1 ;j++)
				arr[j] =arr[j+1];
			
			arr[len-1]=temp;
		}
	}
	
	public static void Arr_Right_Rotate(int[] arr,int num) {
		int len =arr.length-1;
		for(int i=0 ; i<num%(len+1) ; i++) {
			int temp = arr[len];
			for(int j=len ; j>0 ;j--)
				arr[j] =arr[j-1];
			
			arr[0]=temp;
		}
	}


}
