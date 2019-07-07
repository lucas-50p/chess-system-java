package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition(){
		return ChessPosition.fromPosition(position);
	}
	
	
	
	//public void setColor(Color color) {
	//this.color = color;//NO DEIXAR QUE A COR DA PIECE SEJA MODIFICADA
	
	//PROTECTED ESSA OPERAÇÃO SEJA ACESSEIVEL MESMO PACOTE, E SUB CLASSE
	protected boolean isThereOpponentPiece(Position position){
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() !=color;//COR DIFERENTE DA PEÇA 
	}
	
}
