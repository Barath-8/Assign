import java.util.*;

class Solution {  //70-80 ms Solution

	Map<Integer,Set<Character>> row,col;
	Map<String,Set<Character>>miny;
	
	public void solveSudoku(char[][] board) {
		row = new HashMap<>();
		col = new HashMap<>();
		miny= new HashMap<>();


		getSet(board);

		backtrack(board,0,0);
		//        System.out.println(miny+"\n\n"+row+"\n\n"+col+"\n\n"+count);
	}

	void getSet(char[][] brd) {

		for(int r=0 ; r<brd.length ; r++) {
			for(int c =0 ; c<brd[r].length ; c++) {

				if(brd[r][c]=='.') continue;
				String min = String.valueOf(r/3)+
						String.valueOf(c/3);

				if(!row.containsKey(c))
					row.put(c,new HashSet<>());
				if(!col.containsKey(r))
					col.put(r,new HashSet<>());
				if(!miny.containsKey(min))
					miny.put(min,new HashSet<>());

				row.get(c).add(brd[r][c]);
				col.get(r).add(brd[r][c]);

				miny.get(min).add(brd[r][c]);

			}
		}

	}

	boolean backtrack(char[][] brd ,int r , int c){
		if(c == 9) {
			r++;
			c=0;
		}

		if(r==9)
			return true;


		if(brd[r][c]!='.') 
			return backtrack(brd,r,c+1);

		String min = String.valueOf(r/3)+
				String.valueOf(c/3);

		for(char val ='1' ; val<='9' ; val++) {
			if(col.get(r).contains(val) ||
					row.get(c).contains(val)||
					miny.get(min).contains(val))
				continue;
			
			brd[r][c]=val;
			col.get(r).add(val); 
			row.get(c).add(val);
			miny.get(min).add(val);

			if(backtrack(brd,r,c+1))
				return true;

			brd[r][c]='.';

			col.get(r).remove(val); 
			row.get(c).remove(val);
			miny.get(min).remove(val);  

		}

		return false;
	}

}


public class Sudoku_Solver {

	public static void main(String[] args) {

		Solution sol = new Solution();

		char brd[][] = {{'5','3','.','.','7','.','.','.','.'},
						{'6','.','.','1','9','5','.','.','.'},
						{'.','9','8','.','.','.','.','6','.'},
						{'8','.','.','.','6','.','.','.','3'},
						{'4','.','.','8','.','3','.','.','1'},
						{'7','.','.','.','2','.','.','.','6'},
						{'.','6','.','.','.','.','2','8','.'},
						{'.','.','.','4','1','9','.','.','5'},
						{'.','.','.','.','8','.','.','7','9'}};
		
		for(char c[] :brd )
			System.out.println(Arrays.toString(c));
		
		sol.solveSudoku(brd);
		System.out.println("\n\nSolved Suduko\n");
		for(char c[] :brd )
			System.out.println(Arrays.toString(c));


	}

}
