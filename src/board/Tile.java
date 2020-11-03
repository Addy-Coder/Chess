package board;

import piece.Piece;

//-> To represent each and every tile
//-> To return the color and Piece which is on the tile
//-> ocuupied status
public class Tile {
	private boolean occupied;
	private Piece piece;
	
	Tile(){
		this.occupied = false;
	}
	Tile(Piece piece){
		this.occupied = true;
		this.piece = piece;
	}
	
	Tile(Tile tile){
		this.occupied = isOccupied();
		this.piece = getPeice();
	}
	
	public boolean isOccupied() {
		return this.occupied;
	}
	
	public Piece getPeice() {
		return this.piece;
	}
	
}
