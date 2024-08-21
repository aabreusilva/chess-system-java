package chess;

import boardgame.Board;
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

    //Metodo responsável por iniciar a partida de xadrez, colocando as peças no tabuleiro.
    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
