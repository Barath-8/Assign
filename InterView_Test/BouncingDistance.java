package test;
import java.util.Scanner;
public class BouncingDistance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the height : ");
		double h = sc.nextDouble();
		
		System.out.print("\nEnter the bounce factor : ");
		double b=sc.nextDouble();
		sc.close();
		
		double distance = h+ getBounce(h,b);
		
		System.out.println("\nTotal distance travelled by the ball : "+distance+" m");
		
	}

	private static double getBounce(double h, double b) {
		
		if(h<1)
			return 0;
		
		return h*b*2+getBounce(h*b,b);
	}

}
