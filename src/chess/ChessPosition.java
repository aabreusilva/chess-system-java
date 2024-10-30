package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {

        //Programação defensiva.
        //Testando se a coluna for menor que o caractere A(aceita os operadores comparativos) ou a coluna for mais que H não vou aceitar.
        //Se a linha for menor do que 1 ou se a linha for maior do que 8.
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {

            throw new ChessException("Erro ao instanciar ChessPosition. Os valores validos são de A1 a H8.");

        }

        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    //Transformando o nosso tabuleiro em uma matriz (# protected)
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    //Implementação inversa: Dada uma posição na matriz preciso convertê-la em uma posição de xadrez. (# protected _____________________ static)
    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

}
