package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    //Criando o construtor ChessPiece recebendo o board e color.
    //Board repassa a chamada para o construtor da superclasse Piece.
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    //Não criar o set por que não quero que a cor de uma peça seja alterada..
}
