package test;
import java.util.*;
public class Balanced {

	public static void main(String[] args) {
		Balanced obj = new Balanced();
		
		obj.verifyBalanced();
	}

	private void verifyBalanced() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the input string : ");
		String str = sc.next();
		sc.close();
//		String str = "((aesde{d[jd]}dd(uu)))";
		
		boolean result = verify(str);
		
		System.out.println("Balanced : " + result);
		
	}

	private boolean verify(String str) {
		
		Stack<Character> st = new Stack<>();
		for(char c  :str.toCharArray()) {
			if(Character.isLetterOrDigit(c))
				continue;
			
			switch(c) {
				case '}': if(st.isEmpty() || st.pop()!='{')
							return false;
							break;

				case ']': if(st.isEmpty() || st.pop()!='[')
							return false;
							break;
				case ')': if(st.isEmpty() || st.pop()!='(')
							return false;
							break;
				default : st.push(c);
			}
			
		}
		
		return st.isEmpty();
	}

}
