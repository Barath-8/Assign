
public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =20;
//		
//		if(age >=60 )
//			System.out.println("You are Old");
//		else if(age >= 40)
//			System.out.println("You are Middle aged");
//		else if(age >18)
//			System.out.println("You are an Adult");
//		else
//			System.out.println("You are a Minor");
//		
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
