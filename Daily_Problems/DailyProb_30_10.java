import java.util.Stack;

public class DailyProb_30_10 {

	public static void main(String[] args) {
		
		postFix();

	}

	private static void postFix() {
		
		String eval = "138*+";
		
		System.out.println("The evaluated answer is : "+getRes(eval));
		
	}

	private static int getRes(String eval) {
		
		Stack<Integer> st = new Stack<>();
		
		for(char c:eval.toCharArray()) {
			if(c>='0'&&c<='9')
				st.push(c-'0');
			else {
				int val_2 = st.pop(),
					val_1 = st.pop();
				
				int value =  calculate(val_1,val_2,c);
				st.push(value);
			}
		}
		
		
		return st.pop();
	}

	private static int calculate(int val_1, int val_2, char op) {
		
		switch(op) {
			case '+' : return val_1+val_2;
			case '-' : return val_1-val_2;
			case '*' : return val_1*val_2;
			case '/' : return val_1/val_2;
		}
		
		return 0;
	}

}
