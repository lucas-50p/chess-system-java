package boardgame;

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
		
	public boolean possibleMove(Position position){
		return possibleMoves()[position.getRow()][position.getColumn()];//UM METODO CONCRETO,() QUE ESTÁ USANDO UM METODO ABSTRATO. METODO QUE FAZ UM GANÇHO COM A SUB CLASSE 
	}
		
	public boolean isThereAnyPossibleMove(){
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){//MATRIZ DO XADREZ É QUADRADA
			if (mat[i][j]){
				return true;
				}
			}
		}
	return false;
	}
}
