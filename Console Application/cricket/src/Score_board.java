import java.util.Scanner;

public class Score_board {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String[] t1 = {"Rohit(C)","Rahul","Kohli","Surya","Hooda","Pant(Wk)","Hardik","Jaddu","Bhuvi","Chahal","Harshadeep"};
		final String[] t2 = {"Babars(C)","Rizwan","Fakhar","Nawaz","Kushdil","Asif","Ifthikir","Shadap","Haris","Hasnain","Naseem"};
		

		
		Team ind = new Team("Ind" , t1);
		Team pak = new Team("Pak" , t2 );
		
		Match IPL = new Match(ind,pak);

		IPL.Start();
	}

}
