import java.util.*;

public class Board {
	private int[][] _board;
	
	public Board()
	{ reset(); }
	
	public void reset()
	{
		this._board = new int[9][9];
		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				this._board[i][j] = -1;
	}
	
	private void resetAux(int[] aux)
	{
		aux = new int[9];
		for(int i = 0; i < 9; i++) aux[i]=0;
	}
	
	/* Returns true if there is at least one zero in the array. */
	public boolean isThereZero(int[] input)
	{
		/*  */
		for(int i = 0; i < 9; i++)
			if(input[i] == 0) return true;
		return false;
	}
	
	// Returns true if the board is solved.
	@SuppressWarnings("null")
	public boolean isSolved()
	{
		int[] line = null, column = null;
		
		// Checking if there is repeated numbers in the lines and columns.
		for(int i = 0; i < 9; i++)
		{
			resetAux(line);
			resetAux(column);
			for(int j = 0; j < 9; j++)
			{
				if(this._board[i][j] == -1) return false;
				if(this._board[i][j] > 9) return false;
				line[this._board[i][j]]=1;
				column[this._board[j][i]]=1;
			}
			if(isThereZero(line) || isThereZero(column)) return false;
		}
		
		// Now checking if the little squares don't have repeated numbers.
		int[] square1=null, square2=null, square3=null;
		for(int i = 0; i < 9; i++)
		{
			if(i%3==0)
			{
				resetAux(square1);
				resetAux(square2);
				resetAux(square3);
			}
			
			for(int j = 0; j < 3; j++)
			{
				square1[this._board[i][j]]=1;
				square2[this._board[i][j+3]]=1;
				square3[this._board[i][j+6]]=1;
			}
			
			if(i==2 || i==5)
				if(isThereZero(square1) || isThereZero(square2) || isThereZero(square3))
					return false;
		}
		return !(isThereZero(square1) || isThereZero(square2) || isThereZero(square3));
	}
}
