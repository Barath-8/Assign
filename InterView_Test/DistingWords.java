package test;

import java.util.*;

public class DistingWords {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("\nEnter a Sentence :");
		String str = sc.nextLine();
		
		sc.close();
		
		Set<String> distinct = new LinkedHashSet<>(Arrays.asList(str.split(" ")));
		
		System.out.print("\nThe Distinct words are : ");
		
		distinct.stream().forEach(s->System.out.print(s+" "));
		
//		Arrays.asList(str.split(" ")).stream().distinct().forEach(s->System.out.print(s+" "));
		
	}

}
