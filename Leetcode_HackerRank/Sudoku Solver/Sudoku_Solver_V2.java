import java.util.Arrays;

class SolutionV2 {  //5ms Solution

	
	int[][] row,col,miny;
	
	public void solveSudoku(char[][] board) {
		
		row=new int[9][9];
		col=new int[9][9];
		miny=new int[9][9];
		
		getSet(board);

		backtrack(board,0,0);
		//        System.out.println(miny+"\n\n"+row+"\n\n"+col+"\n\n"+count);
	}

	void getSet(char[][] brd) {

		for(int r=0 ; r<brd.length ; r++) {
			for(int c =0 ; c<brd[r].length ; c++) {

				if(brd[r][c]=='.') continue;
				
				int min = (r/3)*3+(c/3);  // to get miny 3x3 index value
				
				row[c][brd[r][c]-'1'] = 1;
				col[r][brd[r][c]-'1'] = 1;
				miny[min][brd[r][c]-'1'] = 1;

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
		
		int min = (r/3)*3+(c/3);
		
		for(char val ='1' ; val<='9' ; val++) {
			if(row[c][val-'1'] == 1 ||
					col[r][val-'1'] == 1||
					miny[min][val-'1'] == 1)
				continue;
				
			brd[r][c]=val;
			
			row[c][val-'1'] = 1;
			col[r][val-'1'] = 1;
			miny[min][val-'1'] = 1;
			
			if(backtrack(brd,r,c+1))
				return true;

			brd[r][c]='.';
			
			row[c][val-'1'] = 0;
			col[r][val-'1'] = 0;
			miny[min][val-'1'] = 0;

		}

		return false;
	}

}


public class Sudoku_Solver_V2 {

	public static void main(String[] args) {

		SolutionV2 sol = new SolutionV2();

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
