package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        //função para imprimir as peças da partida.
        UI.printBoard(chessMatch.getPieces());
    }
}
