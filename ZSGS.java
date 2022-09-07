import java.util.Scanner;

public class ZSGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num =2;
		int term;
		//Geometric progression problem
		System.out.println("Enter the initial number and the nth term to find");
		num =sc.nextInt();
		term = sc.nextInt();
		
		
		int result = (int) (num*Math.pow(2, term-1));
		
		System.out.println("The "+term+" th term is " + result);
	
		
		//Arithemetic Progression
		
		int chess_blks =64;
		
		int res  = chess_blks*(chess_blks+1)/2;
		
		System.out.println("The required no of kiols to fill the board is "+res);
		
		
	}

}
