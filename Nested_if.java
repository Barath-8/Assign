
public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		sc.close();
		
		if(age >18) {
			if(age >=40 ) {
				if(age >= 60)
					System.out.println("You are Old ");
				else 
					System.out.println("You are Middle Age");
			}else
				System.out.println("You are an Adult");
		}else
			System.out.println("You are a Minor");
	}

}
