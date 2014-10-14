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
	
	public boolean isSolved()
	{
		int[] line = null, column = null;
		resetAux(line);
		resetAux(column);
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				if(this._board[i][j] == -1) return false;
				
			}
		}
	}
}
