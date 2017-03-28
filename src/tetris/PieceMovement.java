package tetris;

public class PieceMovement {
	
	public Board moveDown(Board board){
		for (int x = 0; x < board.length(); x++) {
			for (int y = board.rowLength()-1; y >= 0; y--) {
				Piece piece = board.getPieceAt(x, y);
				if(piece instanceof Piece && !piece.isPieceStill()){
					board.setPieceAt(x, y, null);
					board.setPieceAt(x, y + 1, piece);
				}
			}
		}
		return board;
	}
	
	public Board moveLeft(Board board){
		for (int x = 0; x < board.length(); x++) {
			for (int y = 0; y < board.rowLength(); y++) {
				Piece piece = board.getPieceAt(x, y);
				if(piece instanceof Piece && !piece.isPieceStill()){
					board.setPieceAt(x - 1, y, piece);
					board.setPieceAt(x, y, null);
				}
			}
		}
		return board;
	}
	
	public Board moveRight(Board board){
		
		for (int x = 0; x < board.length(); x++) {
			for (int y = 0; y < board.rowLength(); y++) {
				Piece piece = board.getPieceAt(x, y);
				if(piece instanceof Piece && !piece.isPieceStill()){
					board.setPieceAt(x + 1, y, piece);
					board.setPieceAt(x, y, null);
				}
			}
		}
		return board;
	}
	
	
	
}
