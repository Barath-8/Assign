package test;
import java.util.*;
public class Ques2 {
	
	public static void main(String args[]) {
		
		int arr[]= {-1,0,-3,-2,-1,5,4};
		
		Arrays.sort(arr);
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0;i<arr.length ; i++) {
			int sum=0;
			
			int l=i+1,r=arr.length-1;
			
			while(l<r) {
				
				sum=arr[i]+arr[l]+arr[r];
				
				if(sum==0) {
					ans.add(List.of(arr[i],arr[l++],arr[r--]));
				}
				else if(sum<0) 
					l++;
				else if(sum>0) 
					r--;
				
			}
			
			while(i+1<arr.length && arr[i+1] ==arr[i] )
				i++;
		}
		
		System.out.println(ans);
	}

}
