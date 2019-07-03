package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;//(PROTECTED) SOMENTE CLASS DO MESMO PACOTE E SUB CLASS QUE VÃO PODER ACESSAR O TABULHEIRO DE UMA PIECE 
	}

	//public void setBoard(Board board) {
	//	this.board = board;// APAGAR PARA NO SER ALTERADO
	
	
}
