package test;

import java.util.*;

public class Ques1 {

	public static void main(String[] args) {
		
		List<Integer> ans = new ArrayList<>();
		List<Integer> list = List.of(1,5,2,3,8);
		
		int sum = 1;
		
		boolean zero=false;
		int zero_idx = -1;
		
		for(int i=0 ; i<list.size() ; i++) {
			int val = list.get(i);
			
			if(val==0) {
				
				if(zero) {
					zero_idx=-1;
					break;
				}
				else 
					zero_idx=i;
				
				zero=true;
				
			}else 
				sum*=val;	
		}
		
		if(zero) {
			for(int i=0 ; i<list.size() ; i++)
				if(zero_idx == i)
					ans.add(sum);
				else
					ans.add(0);
		}
		else
			for(int val : list)
				ans.add(sum/val);
		
		System.out.println(ans);
	}

}
