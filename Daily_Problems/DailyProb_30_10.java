import java.util.Stack;

public class DailyProb_30_10 {

	public static void main(String[] args) {
		
		postFix();
		bitwise_Mul();
	}

	private static void bitwise_Mul() {
		
		int num = 3;
		
//		int ans = mul_15(num); // multiply by 15
//		int ans = mul_15(num)>>1; //multiply by 7.5
		int ans = mul_15(num)>>4; // eval 15*n/16
		System.out.println(ans);
		
	}

	private static int mul_15(int num) {
		return (num<<4)-num;
	}

	private static void postFix() {
		
		String eval = "545*+5/";
		
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
