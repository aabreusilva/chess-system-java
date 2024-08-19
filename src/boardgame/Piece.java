package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //Posição de uma peça criada.
    }

    //Não quero que o tabuleiro seja acessível pela camada de xadrez acima.
    //Só quero que seja acessado somente dentro do pacote boardgame e também pelas suas subclasses de peças.
    //Somente classes e sub-classes, dentro do mesmo pacote, vão poder acessar o tabuleiro de uma peça.
    protected Board getBoard() {
        return board;
    }


}
