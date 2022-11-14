package test;
import java.util.Scanner;
public class StringTransform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter a Alphabetic String : ");
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : str.toCharArray())
			if(Character.isUpperCase(c))
				sb.append((char)('Z'-(int)(c-'A')));
			else if(Character.isLowerCase(c))
				sb.append((char)('z'-(int)(c-'a')));
		
		System.out.println("Tranformerd String : "+sb);
		
		sc.close();

	}

}
