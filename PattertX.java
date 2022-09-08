
public class PattertX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PROGRAM";
		int back = str.length()-1;
		for(int i=0 ; i<str.length(); i++) {
			for(int j=0 ; j<str.length(); j++) {
				if(i==j || j==back)
					System.out.print(str.charAt(j));
				else
						System.out.print(" ");
				}
			back--;
			System.out.println();
			
		}
	}

}
