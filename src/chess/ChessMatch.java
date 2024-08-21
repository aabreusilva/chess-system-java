package chess;

import boardgame.Board;

public class ChessMatch {

    //Classe com as regras do jogo.

    private Board board;

    //A classe ChessMatch precisa saber o tamanho do tabuleiro.
    public ChessMatch() {

        board = new Board(8, 8);

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
}
