import java.util.Arrays;

public class PushElement {

	public static void main(String[] args) {
		
//		int[] arr= {1, 9, 8, 4, 7, 7, 2, 0, 7, 6, 7};
		int[] arr= {3, 7, 3, 7, 3, 7, 3, 7};
		int target = 7;
		int idx=0;
		
		for(int i=0 ; i<arr.length ; i++)
			if(arr[i]!=target) {
				int temp=arr[i];
				arr[i]=target;
				arr[idx++]=temp;
			}
	
		System.out.println(Arrays.toString(arr));
	}

}
