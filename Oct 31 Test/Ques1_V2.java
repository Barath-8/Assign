package test;

import java.util.*;

public class Ques1_V2 {

	public static void main(String[] args) {
		
		int list[] = {1,2,0,4,0};
		
		int ans[]= getRes(list);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] getRes(int list[]) {
		int ans[]= new int[list.length];
		int sum = 1;
		
		boolean zero=false;
		int zero_idx = -1;
		
		for(int i=0 ; i<list.length ; i++) {
			int val = list[i];
			if(val==0) {
				if(zero) return ans;
				zero_idx=i;
				zero=true;
			}else 
				sum*=val;	
		}
		
		if(zero) 	
			ans[zero_idx]=sum;
		else
			for(int i=0 ; i<list.length ; i++)
				ans[i]=sum/list[i];
		
		return ans;
	}

}
