package test;

import java.util.*;

public class Ques3 {

	public static void main(String[] args) {
		
//		String str = "XYBYAXBY";
		String str = "XBXAXB";
//		String str = "abab";
		
		System.out.println( new Ques3().getRepeat(str));
	}
	
	Set<String> set = new HashSet<>();
	
	String cmb= "";
	
	int getRepeat(String str) {
		
		getSeq(str,0);
		System.out.println(set);
		return set.size();
	}
	
	void getSeq(String str , int idx) {
		
		if(cmb.length()>1) {
			isValid(str.substring(idx-1));
		}
		
		for(int i=idx ; i<str.length() ; i++) {
			cmb+=str.charAt(i);
//			System.out.println(cmb);
			getSeq(str,i+1);
			cmb=cmb.substring(0,cmb.length()-1);
		}
	}
	
	void isValid(String ck) {
		int idx=-1;
		for(int i=0 ; i<cmb.length() ; i++) {
			ck = ck.substring(idx+1);
			idx = ck.indexOf(cmb.charAt(i));
			if(idx==-1) return;
		}
		
			set.add(cmb);
//		System.out.println(cmb +"  "+ ck );
		
	}
	
}