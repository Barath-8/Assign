import java.util.ArrayList;
import java.util.Scanner;

public class NumberSystem34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what term you need to get in a 3,4 Number System : ");
		int term = sc.nextInt();
		sc.close();
		
		System.out.println(numS(term));
	}
		
	static long numS(int n) {
	ArrayList<Long> numSys = new ArrayList<>();
	
	numSys.add(3l);
	numSys.add(4l);
	
	int times = n%2==0? n/2-1: n/2; // to decide how many pairs you need if given odd index i need a extra pair to get its first index
	
	int index = 0; // to get Previous value and using it to get current index value pair
	
	while(times-->0) {
		
		long prev = numSys.get(index++);
		numSys.add(prev*10+3);
		numSys.add(prev*10+4);
		
	}
	System.out.println(numSys);
	
	index = (n%2==0)? numSys.size()-1 : numSys.size()-2;	// to select  what value you need in the pair 
	
	return numSys.get(index);
	

	}
}
