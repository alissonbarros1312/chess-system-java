package chess;

/*
 * classe para representar qual a pe�a do xadrez, e sua cor
 * sendo heran�a da class Piece
 */

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
