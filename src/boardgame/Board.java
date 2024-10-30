package boardgame;

public class Board {
    private int rows;
    private int columns;

    //Criando uma matriz de peças
    private Piece[][] pieces;

    public Board(int rows, int columns) {

        //Programação defensiva dos métodos da classe Board.
        //Quando for criar um tabuleiro a quantidade de linhas e colunas tem que ser pelo menos um.
        //Não faz sentido criar um tabuleiro com zero ou menos colunas.
        if (rows < 1 || columns < 1) {
            throw new BoardException("Erro ao criar o tabuleiro: É necessário que tenha pelo menos 1 linha e 1 coluna.");
        }

        this.rows = rows;
        this.columns = columns;

        //Minha matriz de peças será instanciada com a quantidade de rows e columns.
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //Método para retornar a peça em uma determinada linha e coluna.
    public Piece piece(int row, int column) {

        //Programação defensiva
        //Na hora de acessar uma peça que está em uma dada linha e uma coluna.
        //Se essa posição não existir, então lançar uma nova BoardException.
        if (!positionExistis(row, column)) {
            throw new BoardException("Essa posição não está no tabuleiro.");
        }

        return pieces[row][column];
    }

    //Sobrecarga do mesmo método recebendo position (retornando a peça pela posição)
    public Piece piece(Position position) {

        if (!positionExistis(position)) {
            throw new BoardException("Essa posição não está no tabuleiro.");
        }

        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {

        //Testando se existe uma peça nesta posição.
        if (thereIsAPiece(position)) {
            throw new RuntimeException("Já existe uma peça na posição " + position);
        }

        //Ele vai ter que ir na matriz de peças no tabuleiro na linha position.getRow() e na coluna position.getColumn()
        //Logo depois, atribuir a essa posição da minha matriz de peças como argumento.
        pieces[position.getRow()][position.getColumn()] = piece;

        //Agora irei falar que esta peça não está mais na posição nula.
        piece.position = position;
    }

    //Pegando uma posição e retornando em booleano, dizendo se essa posição existe ou não.
    //var auxiliar, pois dentro da classe terá um momento em que vai ser mais fácil testar pela linha e pela coluna do que só pela position
    private boolean positionExistis(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    //Pega uma posição e retorna em booleano, falando se essa posição existe ou não.
    public boolean positionExistis(Position position) {
        return positionExistis(position.getRow(), position.getColumn());
    }

    //Recebe uma posição, retornando booleano dizendo se nesta posição existe uma peça.
    public boolean thereIsAPiece(Position position) {

        //Antes de testar se existe uma peça na posição X, tenho que testar se essa posição existe?
        //Acrescentando aqui, pois ao executar o thereIsAPiece, primeiro ele irá rodar o thereIsAPiece
        if (!positionExistis(position)) {
            throw new RuntimeException("Essa posição não está no tabuleiro.");
        }

        return piece(position) != null;
    }
}
