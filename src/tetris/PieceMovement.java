package tetris;

public class PieceMovement {
	
	public Board moveDown(Board board){
		for (int x = 0; x < board.length(); x++) {
			for (int y = board.rowLength() - 1; y >= 0 ; y--) {
				Piece piece = board.getPieceAt(x, y);
				if(piece != null && !piece.isPieceStill()){
					board.setPieceAt(x, y + 1, piece);
					board.setPieceAt(x, y, null);
				}
			}
		}
		return board;
	}
	
//	public Board moveLeft(Board board){
//		for (int x = 0; x < board.length(); x++) {
//			for (int y = 0; y < board.rowLength(); y++) {
//				Piece piece = board.getPieceAt(x, y);
//				if(piece instanceof Piece && !piece.isPieceStill()){
//					board.setPieceAt(x - 1, piece.getCurrY(), piece);
//					board.setPieceAt(piece.getCurrX(), piece.getCurrY(), null);
//				}
//			}
//		}
//		return board;
//	}
//	
//	public Board moveRight(Board board){
//		
//		for (int x = 0; x < board.length(); x++) {
//			for (int y = 0; y < board.rowLength(); y++) {
//				Piece piece = board.getPieceAt(x, y);
//				if(piece instanceof Piece && !piece.isPieceStill()){
//					board.setPieceAt(piece.getCurrX() + 1, piece.getCurrY(), piece);
//					board.setPieceAt(piece.getCurrX(), piece.getCurrY(), null);
//				}
//			}
//		}
//		return board;
//	}
//	
}
