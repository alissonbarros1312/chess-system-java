package boardgame;

/*
 * classe para representar as peças do tabuleiro de forma abstrata
 * contendo a sua posicao, e o tabuleiro (board) ao qual pertence
 */

public class Piece { 

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
