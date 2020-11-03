package piece;

import java.util.ArrayList;

import board.Board;
import board.Move;

//-> Abstract class to define the color and abstract movement method

public abstract class Piece {
	private static final boolean WHITE = true, BLACK = false;
	private boolean color;
	
	Piece(boolean color){
		this.color = color;
	}
	
	public boolean getColor() {
		return this.color;
	}
	
	public abstract ArrayList<Move> getMoves(Board b,int x,int y);
}
