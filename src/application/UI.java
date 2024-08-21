package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {

            System.out.print((8 - i) + " ");

            for (int j = 0; j < pieces.length; j++) {

                printPiece(pieces[i][j]);

            }
            System.out.println();
        }

        System.out.println("  a b c d e f g h");

    }

    //Criando um método auxiliar para imprimir uma peça.
    private static void printPiece(ChessPiece piece) {

        //Se essa peça for igual a nulo, então essa peça não foi localizada no tabuleiro.
        if (piece == null) {

            System.out.print("-");

        }
        else {

            System.out.println(piece);

        }
        //Imprimindo um espaço em branco para que as peças não fiquem grudadas umas nas outras.
        System.out.print(" ");
    }
}
