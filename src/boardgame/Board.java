package boardgame;

public class Board {
    private int rows;
    private int columns;

    //Criando uma matriz de peças
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        //Minha matriz de peças será instanciada com a quantidade de rows e columns.
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //Método para retornar a peça em uma determinada linha e coluna.
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    //Sobrecarga do mesmo método recebendo position (retornando a peça pela posição)
    public Piece piece (Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {

        //Ele vai ter que ir na matriz de peças no tabuleiro na linha position.getRow() e na coluna position.getColumn()
        //Logo depois, atribuir a essa posição da minha matriz de peças como argumento.
        pieces[position.getRow()][position.getColumn()] = piece;

        //Agora irei falar que esta peça não está mais na posição nula.
        piece.position = position;
    }
}
