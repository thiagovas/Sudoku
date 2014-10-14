import java.util.*;

public class Board {
	private String[] _board;
	private final String initialLine = "*********";
	
	public Board()
	{ reset(); }
	
	public void reset()
	{
		this._board = new String[9];
		for(int i = 0; i < 9; i++)
			this._board[i] = this.initialLine;
	}
	
	public boolean isSolved()
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				
			}
		}
	}
}
