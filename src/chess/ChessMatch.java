package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    //Classe com as regras do jogo.

    private Board board;

    //A classe ChessMatch precisa saber o tamanho do tabuleiro.
    public ChessMatch() {

        board = new Board(8, 8);
        initialSetup();

    }

    //Esse método vai ter que retornar uma matriz de peças de xadrez correspondente a partida ChessMatch.
    public ChessPiece[][] getPieces() {

        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {

            for (int j = 0; j < board.getColumns(); j++) {

                mat[i][j] = (ChessPiece) board.piece(i, j);

            }
        }

        return mat;

    }

    //Utilizando a operação toPosition que vai receber as coordenadas do xadrez.
    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    //Metodo responsável por iniciar a partida de xadrez, colocando as peças no tabuleiro.
    private void initialSetup() {

        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
