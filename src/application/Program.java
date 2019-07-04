package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
		System.out.println();
		System.out.print("Taget: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
		
		
		}
	}

}
