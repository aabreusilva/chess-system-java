package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Não quero que o tabuleiro seja acessível pela camada de xadrez acima.
    //Só quero que seja acessado somente dentro do pacote boardgame e também pelas suas subclasses de peças.
    protected Board getBoard() {
        return board;
    }


}
